package ardrone_autonomy;

public interface navdata_demo extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ardrone_autonomy/navdata_demo";
  static final java.lang.String _DEFINITION = "Header header\nfloat64 drone_time\nuint16 tag\nuint16 size\nuint32 ctrl_state\nuint32 vbat_flying_percentage\nfloat32 theta\nfloat32 phi\nfloat32 psi\nint32 altitude\nfloat32 vx\nfloat32 vy\nfloat32 vz\nuint32 num_frames\nuint32 detection_camera_type\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  double getDroneTime();
  void setDroneTime(double value);
  short getTag();
  void setTag(short value);
  short getSize();
  void setSize(short value);
  int getCtrlState();
  void setCtrlState(int value);
  int getVbatFlyingPercentage();
  void setVbatFlyingPercentage(int value);
  float getTheta();
  void setTheta(float value);
  float getPhi();
  void setPhi(float value);
  float getPsi();
  void setPsi(float value);
  int getAltitude();
  void setAltitude(int value);
  float getVx();
  void setVx(float value);
  float getVy();
  void setVy(float value);
  float getVz();
  void setVz(float value);
  int getNumFrames();
  void setNumFrames(int value);
  int getDetectionCameraType();
  void setDetectionCameraType(int value);
}
