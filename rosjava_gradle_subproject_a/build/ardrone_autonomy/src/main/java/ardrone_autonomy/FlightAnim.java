package ardrone_autonomy;

public interface FlightAnim extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ardrone_autonomy/FlightAnim";
  static final java.lang.String _DEFINITION = "# 0 : ARDRONE_ANIM_PHI_M30_DEG\n# 1 : ARDRONE_ANIM_PHI_30_DEG\n# 2 : ARDRONE_ANIM_THETA_M30_DEG\n# 3 : ARDRONE_ANIM_THETA_30_DEG\n# 4 : ARDRONE_ANIM_THETA_20DEG_YAW_200DEG\n# 5 : ARDRONE_ANIM_THETA_20DEG_YAW_M200DEG\n# 6 : ARDRONE_ANIM_TURNAROUND\n# 7 : ARDRONE_ANIM_TURNAROUND_GODOWN\n# 8 : ARDRONE_ANIM_YAW_SHAKE\n# 9 : ARDRONE_ANIM_YAW_DANCE\n# 10: ARDRONE_ANIM_PHI_DANCE\n# 11: ARDRONE_ANIM_THETA_DANCE\n# 12: ARDRONE_ANIM_VZ_DANCE\n# 13: ARDRONE_ANIM_WAVE\n# 14: ARDRONE_ANIM_PHI_THETA_MIXED\n# 15: ARDRONE_ANIM_DOUBLE_PHI_THETA_MIXED\n# 16: ARDRONE_ANIM_FLIP_AHEAD\n# 17: ARDRONE_ANIM_FLIP_BEHIND\n# 18: ARDRONE_ANIM_FLIP_LEFT\n# 19: ARDRONE_ANIM_FLIP_RIGHT\n\nuint8 type\n\n# In Milliseconds\n# 0 For Default Duration (Recommended)\nuint32 duration\n\n---\nbool result\n\n";
}
