package cvg_sim_msgs;

public interface ServoCommand extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "cvg_sim_msgs/ServoCommand";
  static final java.lang.String _DEFINITION = "Header header\nuint16[] value\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  short[] getValue();
  void setValue(short[] value);
}
