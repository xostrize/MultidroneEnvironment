package ardrone_autonomy;

public interface LedAnimRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ardrone_autonomy/LedAnimRequest";
  static final java.lang.String _DEFINITION = "# 0 : BLINK_GREEN_RED\n# 1 : BLINK_GREEN\n# 2 : BLINK_RED\n# 3 : BLINK_ORANGE\n# 4 : SNAKE_GREEN_RED\n# 5 : FIRE\n# 6 : STANDARD\n# 7 : RED\n# 8 : GREEN\n# 9 : RED_SNAKE\n# 10: BLANK\n# 11: LEFT_GREEN_RIGHT_RED\n# 12: LEFT_RED_RIGHT_GREEN\n# 13: BLINK_STANDARD\nuint8 type\n\n# In Hz\nfloat32 freq\n\n# In Seconds\nuint8 duration \n\n";
  byte getType();
  void setType(byte value);
  float getFreq();
  void setFreq(float value);
  byte getDuration();
  void setDuration(byte value);
}
