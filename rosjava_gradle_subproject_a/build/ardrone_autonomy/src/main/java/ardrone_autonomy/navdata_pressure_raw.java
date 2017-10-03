package ardrone_autonomy;

public interface navdata_pressure_raw extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ardrone_autonomy/navdata_pressure_raw";
  static final java.lang.String _DEFINITION = "Header header\nfloat64 drone_time\nuint16 tag\nuint16 size\nint32 up\nint16 ut\nint32 Temperature_meas\nint32 Pression_meas\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  double getDroneTime();
  void setDroneTime(double value);
  short getTag();
  void setTag(short value);
  short getSize();
  void setSize(short value);
  int getUp();
  void setUp(int value);
  short getUt();
  void setUt(short value);
  int getTemperatureMeas();
  void setTemperatureMeas(int value);
  int getPressionMeas();
  void setPressionMeas(int value);
}
