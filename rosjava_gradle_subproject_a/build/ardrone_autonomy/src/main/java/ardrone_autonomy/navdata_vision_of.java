package ardrone_autonomy;

public interface navdata_vision_of extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ardrone_autonomy/navdata_vision_of";
  static final java.lang.String _DEFINITION = "Header header\nfloat64 drone_time\nuint16 tag\nuint16 size\nfloat32[] of_dx\nfloat32[] of_dy\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  double getDroneTime();
  void setDroneTime(double value);
  short getTag();
  void setTag(short value);
  short getSize();
  void setSize(short value);
  float[] getOfDx();
  void setOfDx(float[] value);
  float[] getOfDy();
  void setOfDy(float[] value);
}
