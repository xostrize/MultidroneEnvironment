package cvg_sim_msgs;

public interface Altitude extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "cvg_sim_msgs/Altitude";
  static final java.lang.String _DEFINITION = "Header header\nfloat32 height\nfloat32 altitude\nfloat32 elevation\nfloat32 qnh\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  float getHeight();
  void setHeight(float value);
  float getAltitude();
  void setAltitude(float value);
  float getElevation();
  void setElevation(float value);
  float getQnh();
  void setQnh(float value);
}
