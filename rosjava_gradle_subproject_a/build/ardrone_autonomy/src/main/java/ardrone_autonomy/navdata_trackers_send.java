package ardrone_autonomy;

public interface navdata_trackers_send extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ardrone_autonomy/navdata_trackers_send";
  static final java.lang.String _DEFINITION = "Header header\nfloat64 drone_time\nuint16 tag\nuint16 size\nint32[] locked\nvector21[] point\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  double getDroneTime();
  void setDroneTime(double value);
  short getTag();
  void setTag(short value);
  short getSize();
  void setSize(short value);
  int[] getLocked();
  void setLocked(int[] value);
  java.util.List<ardrone_autonomy.vector21> getPoint();
  void setPoint(java.util.List<ardrone_autonomy.vector21> value);
}
