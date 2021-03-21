/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE TAG PACKING
package com.MAVLink.protocol;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
 * Tag message
 */
public class msg_tag extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_TAG = 27;
    public static final int MAVLINK_MSG_LENGTH = 86;
    private static final long serialVersionUID = MAVLINK_MSG_ID_TAG;

      
    /**
     * 
     */
    public float a0x;
      
    /**
     * 
     */
    public float a0y;
      
    /**
     * 
     */
    public float a0z;
      
    /**
     * 
     */
    public float a0r;
      
    /**
     * 
     */
    public float a1x;
      
    /**
     * 
     */
    public float a1y;
      
    /**
     * 
     */
    public float a1z;
      
    /**
     * 
     */
    public float a1r;
      
    /**
     * 
     */
    public float a2x;
      
    /**
     * 
     */
    public float a2y;
      
    /**
     * 
     */
    public float a2z;
      
    /**
     * 
     */
    public float a2r;
      
    /**
     * 
     */
    public float a3x;
      
    /**
     * 
     */
    public float a3y;
      
    /**
     * 
     */
    public float a3z;
      
    /**
     * 
     */
    public float a3r;
      
    /**
     * 
     */
    public float t0x;
      
    /**
     * 
     */
    public float t0y;
      
    /**
     * 
     */
    public float t0z;
      
    /**
     * 
     */
    public int a0;
      
    /**
     * 
     */
    public int a1;
      
    /**
     * 
     */
    public int a2;
      
    /**
     * 
     */
    public int a3;
      
    /**
     * 
     */
    public int t0;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_TAG;
        
        packet.payload.putFloat(a0x);
        packet.payload.putFloat(a0y);
        packet.payload.putFloat(a0z);
        packet.payload.putFloat(a0r);
        packet.payload.putFloat(a1x);
        packet.payload.putFloat(a1y);
        packet.payload.putFloat(a1z);
        packet.payload.putFloat(a1r);
        packet.payload.putFloat(a2x);
        packet.payload.putFloat(a2y);
        packet.payload.putFloat(a2z);
        packet.payload.putFloat(a2r);
        packet.payload.putFloat(a3x);
        packet.payload.putFloat(a3y);
        packet.payload.putFloat(a3z);
        packet.payload.putFloat(a3r);
        packet.payload.putFloat(t0x);
        packet.payload.putFloat(t0y);
        packet.payload.putFloat(t0z);
        packet.payload.putUnsignedShort(a0);
        packet.payload.putUnsignedShort(a1);
        packet.payload.putUnsignedShort(a2);
        packet.payload.putUnsignedShort(a3);
        packet.payload.putUnsignedShort(t0);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a tag message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.a0x = payload.getFloat();
        this.a0y = payload.getFloat();
        this.a0z = payload.getFloat();
        this.a0r = payload.getFloat();
        this.a1x = payload.getFloat();
        this.a1y = payload.getFloat();
        this.a1z = payload.getFloat();
        this.a1r = payload.getFloat();
        this.a2x = payload.getFloat();
        this.a2y = payload.getFloat();
        this.a2z = payload.getFloat();
        this.a2r = payload.getFloat();
        this.a3x = payload.getFloat();
        this.a3y = payload.getFloat();
        this.a3z = payload.getFloat();
        this.a3r = payload.getFloat();
        this.t0x = payload.getFloat();
        this.t0y = payload.getFloat();
        this.t0z = payload.getFloat();
        this.a0 = payload.getUnsignedShort();
        this.a1 = payload.getUnsignedShort();
        this.a2 = payload.getUnsignedShort();
        this.a3 = payload.getUnsignedShort();
        this.t0 = payload.getUnsignedShort();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_tag() {
        this.msgid = MAVLINK_MSG_ID_TAG;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_tag( float a0x, float a0y, float a0z, float a0r, float a1x, float a1y, float a1z, float a1r, float a2x, float a2y, float a2z, float a2r, float a3x, float a3y, float a3z, float a3r, float t0x, float t0y, float t0z, int a0, int a1, int a2, int a3, int t0) {
        this.msgid = MAVLINK_MSG_ID_TAG;

        this.a0x = a0x;
        this.a0y = a0y;
        this.a0z = a0z;
        this.a0r = a0r;
        this.a1x = a1x;
        this.a1y = a1y;
        this.a1z = a1z;
        this.a1r = a1r;
        this.a2x = a2x;
        this.a2y = a2y;
        this.a2z = a2z;
        this.a2r = a2r;
        this.a3x = a3x;
        this.a3y = a3y;
        this.a3z = a3z;
        this.a3r = a3r;
        this.t0x = t0x;
        this.t0y = t0y;
        this.t0z = t0z;
        this.a0 = a0;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.t0 = t0;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_tag( float a0x, float a0y, float a0z, float a0r, float a1x, float a1y, float a1z, float a1r, float a2x, float a2y, float a2z, float a2r, float a3x, float a3y, float a3z, float a3r, float t0x, float t0y, float t0z, int a0, int a1, int a2, int a3, int t0, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_TAG;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.a0x = a0x;
        this.a0y = a0y;
        this.a0z = a0z;
        this.a0r = a0r;
        this.a1x = a1x;
        this.a1y = a1y;
        this.a1z = a1z;
        this.a1r = a1r;
        this.a2x = a2x;
        this.a2y = a2y;
        this.a2z = a2z;
        this.a2r = a2r;
        this.a3x = a3x;
        this.a3y = a3y;
        this.a3z = a3z;
        this.a3r = a3r;
        this.t0x = t0x;
        this.t0y = t0y;
        this.t0z = t0z;
        this.a0 = a0;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.t0 = t0;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_tag(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_TAG;
        
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
        return "MAVLINK_MSG_ID_TAG - sysid:"+sysid+" compid:"+compid+" a0x:"+a0x+" a0y:"+a0y+" a0z:"+a0z+" a0r:"+a0r+" a1x:"+a1x+" a1y:"+a1y+" a1z:"+a1z+" a1r:"+a1r+" a2x:"+a2x+" a2y:"+a2y+" a2z:"+a2z+" a2r:"+a2r+" a3x:"+a3x+" a3y:"+a3y+" a3z:"+a3z+" a3r:"+a3r+" t0x:"+t0x+" t0y:"+t0y+" t0z:"+t0z+" a0:"+a0+" a1:"+a1+" a2:"+a2+" a3:"+a3+" t0:"+t0+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_TAG";
    }
}
        