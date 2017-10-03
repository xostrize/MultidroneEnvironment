package cvg_sim_msgs;

public interface HeightCommand extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "cvg_sim_msgs/HeightCommand";
  static final java.lang.String _DEFINITION = "Header header\nfloat32 height\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  float getHeight();
  void setHeight(float value);
}
