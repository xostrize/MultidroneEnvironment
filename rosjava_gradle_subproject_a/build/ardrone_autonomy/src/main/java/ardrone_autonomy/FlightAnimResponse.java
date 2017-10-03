package ardrone_autonomy;

public interface FlightAnimResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ardrone_autonomy/FlightAnimResponse";
  static final java.lang.String _DEFINITION = "bool result";
  boolean getResult();
  void setResult(boolean value);
}
