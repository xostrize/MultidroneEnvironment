package cvg_sim_msgs;

public interface MotorStatus extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "cvg_sim_msgs/MotorStatus";
  static final java.lang.String _DEFINITION = "Header header\nbool on\nbool running\nfloat32[] frequency\nuint8[] current\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  boolean getOn();
  void setOn(boolean value);
  boolean getRunning();
  void setRunning(boolean value);
  float[] getFrequency();
  void setFrequency(float[] value);
  org.jboss.netty.buffer.ChannelBuffer getCurrent();
  void setCurrent(org.jboss.netty.buffer.ChannelBuffer value);
}
