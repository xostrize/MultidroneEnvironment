package ardrone_autonomy;

public interface navdata_phys_measures extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ardrone_autonomy/navdata_phys_measures";
  static final java.lang.String _DEFINITION = "Header header\nfloat64 drone_time\nuint16 tag\nuint16 size\nfloat32 accs_temp\nuint16 gyro_temp\nfloat32[] phys_accs\nfloat32[] phys_gyros\nuint32 alim3V3\nuint32 vrefEpson\nuint32 vrefIDG\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  double getDroneTime();
  void setDroneTime(double value);
  short getTag();
  void setTag(short value);
  short getSize();
  void setSize(short value);
  float getAccsTemp();
  void setAccsTemp(float value);
  short getGyroTemp();
  void setGyroTemp(short value);
  float[] getPhysAccs();
  void setPhysAccs(float[] value);
  float[] getPhysGyros();
  void setPhysGyros(float[] value);
  int getAlim3V3();
  void setAlim3V3(int value);
  int getVrefEpson();
  void setVrefEpson(int value);
  int getVrefIDG();
  void setVrefIDG(int value);
}
