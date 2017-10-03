package cvg_sim_msgs;

public interface VelocityXYCommand extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "cvg_sim_msgs/VelocityXYCommand";
  static final java.lang.String _DEFINITION = "Header header\nfloat32 x\nfloat32 y\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  float getX();
  void setX(float value);
  float getY();
  void setY(float value);
}
