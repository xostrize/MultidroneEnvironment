package ardrone_autonomy;

public interface navdata_zimmu_3000 extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ardrone_autonomy/navdata_zimmu_3000";
  static final java.lang.String _DEFINITION = "Header header\nfloat64 drone_time\nuint16 tag\nuint16 size\nint32 vzimmuLSB\nfloat32 vzfind\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  double getDroneTime();
  void setDroneTime(double value);
  short getTag();
  void setTag(short value);
  short getSize();
  void setSize(short value);
  int getVzimmuLSB();
  void setVzimmuLSB(int value);
  float getVzfind();
  void setVzfind(float value);
}
