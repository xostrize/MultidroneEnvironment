package cvg_sim_msgs;

public interface MotorCommand extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "cvg_sim_msgs/MotorCommand";
  static final java.lang.String _DEFINITION = "Header header\nfloat32[] force\nfloat32[] torque\nfloat32[] frequency\nfloat32[] voltage\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  float[] getForce();
  void setForce(float[] value);
  float[] getTorque();
  void setTorque(float[] value);
  float[] getFrequency();
  void setFrequency(float[] value);
  float[] getVoltage();
  void setVoltage(float[] value);
}
