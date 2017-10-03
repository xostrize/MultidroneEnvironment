package cvg_sim_msgs;

public interface Altimeter extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "cvg_sim_msgs/Altimeter";
  static final java.lang.String _DEFINITION = "Header header\nfloat32 altitude\nfloat32 pressure\nfloat32 qnh\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  float getAltitude();
  void setAltitude(float value);
  float getPressure();
  void setPressure(float value);
  float getQnh();
  void setQnh(float value);
}
