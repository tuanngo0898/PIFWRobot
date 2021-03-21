/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE FILTER_PARAMS PACKING
package com.MAVLink.protocol;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
 * 
 */
public class msg_filter_params extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_FILTER_PARAMS = 14;
    public static final int MAVLINK_MSG_LENGTH = 17;
    private static final long serialVersionUID = MAVLINK_MSG_ID_FILTER_PARAMS;

      
    /**
     * Tilt angle offset
     */
    public float tilt_offset;
      
    /**
     * Belive in gyroscope
     */
    public float g_believe;
      
    /**
     * 
     */
    public float complementary_gain;
      
    /**
     * 
     */
    public float madgwick_beta;
      
    /**
     * Tilt type
     */
    public short tilt_type;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_FILTER_PARAMS;
        
        packet.payload.putFloat(tilt_offset);
        packet.payload.putFloat(g_believe);
        packet.payload.putFloat(complementary_gain);
        packet.payload.putFloat(madgwick_beta);
        packet.payload.putUnsignedByte(tilt_type);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a filter_params message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.tilt_offset = payload.getFloat();
        this.g_believe = payload.getFloat();
        this.complementary_gain = payload.getFloat();
        this.madgwick_beta = payload.getFloat();
        this.tilt_type = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_filter_params() {
        this.msgid = MAVLINK_MSG_ID_FILTER_PARAMS;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_filter_params( float tilt_offset, float g_believe, float complementary_gain, float madgwick_beta, short tilt_type) {
        this.msgid = MAVLINK_MSG_ID_FILTER_PARAMS;

        this.tilt_offset = tilt_offset;
        this.g_believe = g_believe;
        this.complementary_gain = complementary_gain;
        this.madgwick_beta = madgwick_beta;
        this.tilt_type = tilt_type;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_filter_params( float tilt_offset, float g_believe, float complementary_gain, float madgwick_beta, short tilt_type, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_FILTER_PARAMS;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.tilt_offset = tilt_offset;
        this.g_believe = g_believe;
        this.complementary_gain = complementary_gain;
        this.madgwick_beta = madgwick_beta;
        this.tilt_type = tilt_type;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_filter_params(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_FILTER_PARAMS;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

              
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_FILTER_PARAMS - sysid:"+sysid+" compid:"+compid+" tilt_offset:"+tilt_offset+" g_believe:"+g_believe+" complementary_gain:"+complementary_gain+" madgwick_beta:"+madgwick_beta+" tilt_type:"+tilt_type+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_FILTER_PARAMS";
    }
}
        