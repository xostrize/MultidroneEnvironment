package ardrone_autonomy;

public interface navdata_trims extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ardrone_autonomy/navdata_trims";
  static final java.lang.String _DEFINITION = "Header header\nfloat64 drone_time\nuint16 tag\nuint16 size\nfloat32 angular_rates_trim_r\nfloat32 euler_angles_trim_theta\nfloat32 euler_angles_trim_phi\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  double getDroneTime();
  void setDroneTime(double value);
  short getTag();
  void setTag(short value);
  short getSize();
  void setSize(short value);
  float getAngularRatesTrimR();
  void setAngularRatesTrimR(float value);
  float getEulerAnglesTrimTheta();
  void setEulerAnglesTrimTheta(float value);
  float getEulerAnglesTrimPhi();
  void setEulerAnglesTrimPhi(float value);
}
