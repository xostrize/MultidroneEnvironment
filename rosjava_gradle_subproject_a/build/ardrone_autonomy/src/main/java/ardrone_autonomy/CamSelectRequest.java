package ardrone_autonomy;

public interface CamSelectRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ardrone_autonomy/CamSelectRequest";
  static final java.lang.String _DEFINITION = "uint8 channel\n";
  byte getChannel();
  void setChannel(byte value);
}
