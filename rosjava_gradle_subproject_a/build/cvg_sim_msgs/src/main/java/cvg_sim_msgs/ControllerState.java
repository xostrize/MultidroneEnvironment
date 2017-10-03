package cvg_sim_msgs;

public interface ControllerState extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "cvg_sim_msgs/ControllerState";
  static final java.lang.String _DEFINITION = "Header header\nuint8 source\n\nuint8 mode\nuint8 MOTORS = 1\nuint8 ATTITUDE = 2\nuint8 VELOCITY = 4\nuint8 POSITION = 8\nuint8 HEADING = 16\nuint8 HEIGHT = 32\n\nuint8 state\nuint8 MOTORS_RUNNING = 1\nuint8 AIRBORNE = 2\n";
  static final byte MOTORS = 1;
  static final byte ATTITUDE = 2;
  static final byte VELOCITY = 4;
  static final byte POSITION = 8;
  static final byte HEADING = 16;
  static final byte HEIGHT = 32;
  static final byte MOTORS_RUNNING = 1;
  static final byte AIRBORNE = 2;
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  byte getSource();
  void setSource(byte value);
  byte getMode();
  void setMode(byte value);
  byte getState();
  void setState(byte value);
}
