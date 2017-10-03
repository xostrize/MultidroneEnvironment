package ardrone_autonomy;

public interface navdata_rc_references extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ardrone_autonomy/navdata_rc_references";
  static final java.lang.String _DEFINITION = "Header header\nfloat64 drone_time\nuint16 tag\nuint16 size\nint32 rc_ref_pitch\nint32 rc_ref_roll\nint32 rc_ref_yaw\nint32 rc_ref_gaz\nint32 rc_ref_ag\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  double getDroneTime();
  void setDroneTime(double value);
  short getTag();
  void setTag(short value);
  short getSize();
  void setSize(short value);
  int getRcRefPitch();
  void setRcRefPitch(int value);
  int getRcRefRoll();
  void setRcRefRoll(int value);
  int getRcRefYaw();
  void setRcRefYaw(int value);
  int getRcRefGaz();
  void setRcRefGaz(int value);
  int getRcRefAg();
  void setRcRefAg(int value);
}
