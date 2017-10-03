package ardrone_autonomy;

public interface navdata_vision_raw extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ardrone_autonomy/navdata_vision_raw";
  static final java.lang.String _DEFINITION = "Header header\nfloat64 drone_time\nuint16 tag\nuint16 size\nfloat32 vision_tx_raw\nfloat32 vision_ty_raw\nfloat32 vision_tz_raw\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  double getDroneTime();
  void setDroneTime(double value);
  short getTag();
  void setTag(short value);
  short getSize();
  void setSize(short value);
  float getVisionTxRaw();
  void setVisionTxRaw(float value);
  float getVisionTyRaw();
  void setVisionTyRaw(float value);
  float getVisionTzRaw();
  void setVisionTzRaw(float value);
}
