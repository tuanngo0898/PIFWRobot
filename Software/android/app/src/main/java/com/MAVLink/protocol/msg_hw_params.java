/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE HW_PARAMS PACKING
package com.MAVLink.protocol;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
* Switch to invert motor rotation direction. Need a respond message for confimation
*/
public class msg_hw_params extends MAVLinkMessage{

    public static final int MAVLINK_MSG_ID_HW_PARAMS = 8;
    public static final int MAVLINK_MSG_LENGTH = 13;
    private static final long serialVersionUID = MAVLINK_MSG_ID_HW_PARAMS;


      
    /**
    * Motor 0 positive deadband
    */
    public short motor0_pos_deadband;
      
    /**
    * Motor 0 negative deadband
    */
    public short motor0_neg_deadband;
      
    /**
    * Motor 1 positive deadband
    */
    public short motor1_pos_deadband;
      
    /**
    * Motor 1 negative deadband
    */
    public short motor1_neg_deadband;
      
    /**
    * Motor 0 Invert
    */
    public byte motor0_invert;
      
    /**
    * Motor 1 Invert
    */
    public byte motor1_invert;
      
    /**
    * Encoder 0 Invert
    */
    public byte encoder0_invert;
      
    /**
    * Encoder 1 Invert
    */
    public byte encoder1_invert;
      
    /**
    * Switch to invert encoder from motor 0 to motor 1 and vice versa
    */
    public byte encoder_exchange;
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_HW_PARAMS;
              
        packet.payload.putShort(motor0_pos_deadband);
              
        packet.payload.putShort(motor0_neg_deadband);
              
        packet.payload.putShort(motor1_pos_deadband);
              
        packet.payload.putShort(motor1_neg_deadband);
              
        packet.payload.putByte(motor0_invert);
              
        packet.payload.putByte(motor1_invert);
              
        packet.payload.putByte(encoder0_invert);
              
        packet.payload.putByte(encoder1_invert);
              
        packet.payload.putByte(encoder_exchange);
        
        return packet;
    }

    /**
    * Decode a hw_params message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.motor0_pos_deadband = payload.getShort();
              
        this.motor0_neg_deadband = payload.getShort();
              
        this.motor1_pos_deadband = payload.getShort();
              
        this.motor1_neg_deadband = payload.getShort();
              
        this.motor0_invert = payload.getByte();
              
        this.motor1_invert = payload.getByte();
              
        this.encoder0_invert = payload.getByte();
              
        this.encoder1_invert = payload.getByte();
              
        this.encoder_exchange = payload.getByte();
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_hw_params(){
        msgid = MAVLINK_MSG_ID_HW_PARAMS;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_hw_params(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_HW_PARAMS;
        unpack(mavLinkPacket.payload);        
    }

                      
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_HW_PARAMS - sysid:"+sysid+" compid:"+compid+" motor0_pos_deadband:"+motor0_pos_deadband+" motor0_neg_deadband:"+motor0_neg_deadband+" motor1_pos_deadband:"+motor1_pos_deadband+" motor1_neg_deadband:"+motor1_neg_deadband+" motor0_invert:"+motor0_invert+" motor1_invert:"+motor1_invert+" encoder0_invert:"+encoder0_invert+" encoder1_invert:"+encoder1_invert+" encoder_exchange:"+encoder_exchange+"";
    }
}
        