#include "mode_run.h"
#include "ui_mode_run.h"

Mode_run::Mode_run(QWidget *parent) :
    Mode_common(parent),
    ui(new Ui::Mode_run)
{
    ui->setupUi(this);
    g_controller_timer = new QTimer(this);
    connect(g_controller_timer, SIGNAL(timeout()), this, SLOT(remote_controll_cmd()));
    g_logging = false;
}

Mode_run::~Mode_run()
{
    delete g_controller_timer;
    delete ui;
}

void Mode_run::mav_recv(mavlink_message_t *msg){
    switch(msg->msgid) {
    case MAVLINK_MSG_ID_EVT_RPY:
        mavlink_evt_rpy_t evt_rpy;
        mavlink_msg_evt_rpy_decode(msg, &evt_rpy);
        ui->txtBoxRoll->setText(QString::number(static_cast<double>(evt_rpy.roll)));
        ui->txtBoxPitch->setText(QString::number(static_cast<double>(evt_rpy.pitch)));
        ui->txtBoxYaw->setText(QString::number(static_cast<double>(evt_rpy.yaw)));
        break;
    case MAVLINK_MSG_ID_EVT_SENSOR:
        mavlink_evt_sensor_t sensor_status;
        mavlink_msg_evt_sensor_decode(msg,&sensor_status);
        if(sensor_status.imu_status == SENSOR_IMU_OK){
            show_status("IMU OK", 1000);
        }
        else{
            show_status("IMU ERROR", 1000);
        }
        break;
    case MAVLINK_MSG_ID_EVT_TILT_CAL:
        mavlink_evt_tilt_raw_t tilt_msg;
        mavlink_msg_evt_tilt_raw_decode(msg,&tilt_msg);
        ui->tb_tilt_cal->setText(QString::number(tilt_msg.tilt));
        break;
    case MAVLINK_MSG_ID_CONTROL:
        if(g_logging){
            mavlink_control_t control;
            mavlink_msg_control_decode(msg, &control);
            QString line;
            line = "C " + QString::number(control.left) + " " + QString::number(control.right) + "\n";
            g_file_control_measurement.write(line.toStdString().c_str());
            ui->pteControl->appendHtml(line);
        }
        break;
    case MAVLINK_MSG_ID_MEASUREMENT:
        if(g_logging){
            mavlink_measurement_t measurement;
            mavlink_msg_measurement_decode(msg, &measurement);
            QString line;
            line =  "M " + QString::number(measurement.x) + " " + QString::number(measurement.y) + " " + QString::number(measurement.z)
                    + " " + QString::number(measurement.r) + " " + QString::number(measurement.yaw) + "\n";
            g_file_control_measurement.write(line.toStdString().c_str());
            ui->pteMeasurement->appendHtml(line);
        }
    }
}

void Mode_run::remote_controll_cmd(){
    mavlink_message_t msg;
    uint8_t mav_send_buf[255];
    float VX = ui->txtb_pidt_vx->text().toFloat();
    float OMEGA = ui->txtb_pidt_w->text().toFloat();
    mavlink_msg_cmd_velocity_pack(0,0,&msg,VX,OMEGA);
    uint16_t len = mavlink_msg_to_send_buffer(mav_send_buf, &msg);
    emit mav_send(QByteArray::fromRawData(reinterpret_cast<char*>(mav_send_buf),len));
}

void Mode_run::on_btn_control_enable_clicked()
{
    if(g_control_enable == false){
        g_control_enable=true;
        ui->btn_control_enable->setText("Enabled");
        g_controller_timer->start(100);
    }
    else{
        g_control_enable = false;
        ui->btn_control_enable->setText("Disabled");
        g_controller_timer->stop();
    }
}

void Mode_run::on_btn_change_mode_run_clicked()
{
    emit mode_change(MODE_RUN);
}

void Mode_run::update_joystick(axis_t axis, double value){
    switch (axis){
    case AXIS_0:
        ui->txtb_pidt_w->setText(QString::number(value));
        break;
    case AXIS_1:
        ui->txtb_pidt_vx->setText(QString::number(value));
    }
}

void Mode_run::on_btn_log_clicked()
{
    if(g_logging){
        g_logging = false;
        ui->btn_log->setText("Log");
        if(g_file_control_measurement.isOpen()){
            g_file_control_measurement.close();
        }
    }
    else{
        g_file_control_measurement.setFileName("control_measurement.txt");
        if(g_file_control_measurement.open(QIODevice::WriteOnly | QIODevice::Text)){
            g_logging = true;
            ui->btn_log->setText("Logging");
            ui->pteMeasurement->clear();
            ui->pteControl->clear();
        }
    }
}
