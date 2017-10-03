package ardrone_autonomy;

public interface navdata_euler_angles extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ardrone_autonomy/navdata_euler_angles";
  static final java.lang.String _DEFINITION = "Header header\nfloat64 drone_time\nuint16 tag\nuint16 size\nfloat32 theta_a\nfloat32 phi_a\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  double getDroneTime();
  void setDroneTime(double value);
  short getTag();
  void setTag(short value);
  short getSize();
  void setSize(short value);
  float getThetaA();
  void setThetaA(float value);
  float getPhiA();
  void setPhiA(float value);
}
