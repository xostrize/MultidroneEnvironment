package ardrone_autonomy;

public interface navdata_vision_detect extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ardrone_autonomy/navdata_vision_detect";
  static final java.lang.String _DEFINITION = "Header header\nfloat64 drone_time\nuint16 tag\nuint16 size\nuint32 nb_detected\nuint32[] type\nuint32[] xc\nuint32[] yc\nuint32[] width\nuint32[] height\nuint32[] dist\nfloat32[] orientation_angle\nmatrix33[] rotation\nvector31[] translation\nuint32[] camera_source\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  double getDroneTime();
  void setDroneTime(double value);
  short getTag();
  void setTag(short value);
  short getSize();
  void setSize(short value);
  int getNbDetected();
  void setNbDetected(int value);
  int[] getType();
  void setType(int[] value);
  int[] getXc();
  void setXc(int[] value);
  int[] getYc();
  void setYc(int[] value);
  int[] getWidth();
  void setWidth(int[] value);
  int[] getHeight();
  void setHeight(int[] value);
  int[] getDist();
  void setDist(int[] value);
  float[] getOrientationAngle();
  void setOrientationAngle(float[] value);
  java.util.List<ardrone_autonomy.matrix33> getRotation();
  void setRotation(java.util.List<ardrone_autonomy.matrix33> value);
  java.util.List<ardrone_autonomy.vector31> getTranslation();
  void setTranslation(java.util.List<ardrone_autonomy.vector31> value);
  int[] getCameraSource();
  void setCameraSource(int[] value);
}
