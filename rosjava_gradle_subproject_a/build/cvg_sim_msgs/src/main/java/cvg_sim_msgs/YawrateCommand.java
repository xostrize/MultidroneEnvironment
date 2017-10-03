package cvg_sim_msgs;

public interface YawrateCommand extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "cvg_sim_msgs/YawrateCommand";
  static final java.lang.String _DEFINITION = "Header header\nfloat32 turnrate\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  float getTurnrate();
  void setTurnrate(float value);
}
