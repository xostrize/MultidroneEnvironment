package ardrone_autonomy;

public interface navdata_vision_perf extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ardrone_autonomy/navdata_vision_perf";
  static final java.lang.String _DEFINITION = "Header header\nfloat64 drone_time\nuint16 tag\nuint16 size\nfloat32 time_corners\nfloat32 time_compute\nfloat32 time_tracking\nfloat32 time_trans\nfloat32 time_update\nfloat32[] time_custom\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  double getDroneTime();
  void setDroneTime(double value);
  short getTag();
  void setTag(short value);
  short getSize();
  void setSize(short value);
  float getTimeCorners();
  void setTimeCorners(float value);
  float getTimeCompute();
  void setTimeCompute(float value);
  float getTimeTracking();
  void setTimeTracking(float value);
  float getTimeTrans();
  void setTimeTrans(float value);
  float getTimeUpdate();
  void setTimeUpdate(float value);
  float[] getTimeCustom();
  void setTimeCustom(float[] value);
}
