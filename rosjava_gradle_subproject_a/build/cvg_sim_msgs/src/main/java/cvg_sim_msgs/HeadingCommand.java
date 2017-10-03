package cvg_sim_msgs;

public interface HeadingCommand extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "cvg_sim_msgs/HeadingCommand";
  static final java.lang.String _DEFINITION = "Header header\nfloat32 heading\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  float getHeading();
  void setHeading(float value);
}
