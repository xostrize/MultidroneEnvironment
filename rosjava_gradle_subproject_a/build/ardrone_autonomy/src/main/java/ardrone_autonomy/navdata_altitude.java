package ardrone_autonomy;

public interface navdata_altitude extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ardrone_autonomy/navdata_altitude";
  static final java.lang.String _DEFINITION = "Header header\nfloat64 drone_time\nuint16 tag\nuint16 size\nint32 altitude_vision\nfloat32 altitude_vz\nint32 altitude_ref\nint32 altitude_raw\nfloat32 obs_accZ\nfloat32 obs_alt\nvector31 obs_x\nuint32 obs_state\nvector21 est_vb\nuint32 est_state\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  double getDroneTime();
  void setDroneTime(double value);
  short getTag();
  void setTag(short value);
  short getSize();
  void setSize(short value);
  int getAltitudeVision();
  void setAltitudeVision(int value);
  float getAltitudeVz();
  void setAltitudeVz(float value);
  int getAltitudeRef();
  void setAltitudeRef(int value);
  int getAltitudeRaw();
  void setAltitudeRaw(int value);
  float getObsAccZ();
  void setObsAccZ(float value);
  float getObsAlt();
  void setObsAlt(float value);
  ardrone_autonomy.vector31 getObsX();
  void setObsX(ardrone_autonomy.vector31 value);
  int getObsState();
  void setObsState(int value);
  ardrone_autonomy.vector21 getEstVb();
  void setEstVb(ardrone_autonomy.vector21 value);
  int getEstState();
  void setEstState(int value);
}
