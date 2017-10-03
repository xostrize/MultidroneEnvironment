package ardrone_autonomy;

public interface navdata_games extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ardrone_autonomy/navdata_games";
  static final java.lang.String _DEFINITION = "Header header\nfloat64 drone_time\nuint16 tag\nuint16 size\nuint32 double_tap_counter\nuint32 finish_line_counter\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  double getDroneTime();
  void setDroneTime(double value);
  short getTag();
  void setTag(short value);
  short getSize();
  void setSize(short value);
  int getDoubleTapCounter();
  void setDoubleTapCounter(int value);
  int getFinishLineCounter();
  void setFinishLineCounter(int value);
}
