package ardrone_autonomy;

public interface navdata_adc_data_frame extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ardrone_autonomy/navdata_adc_data_frame";
  static final java.lang.String _DEFINITION = "Header header\nfloat64 drone_time\nuint16 tag\nuint16 size\nuint32 version\nuint8[] data_frame\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  double getDroneTime();
  void setDroneTime(double value);
  short getTag();
  void setTag(short value);
  short getSize();
  void setSize(short value);
  int getVersion();
  void setVersion(int value);
  org.jboss.netty.buffer.ChannelBuffer getDataFrame();
  void setDataFrame(org.jboss.netty.buffer.ChannelBuffer value);
}
