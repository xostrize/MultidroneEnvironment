package cvg_sim_msgs;

public interface ThrustCommand extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "cvg_sim_msgs/ThrustCommand";
  static final java.lang.String _DEFINITION = "Header header\nfloat32 thrust\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  float getThrust();
  void setThrust(float value);
}
