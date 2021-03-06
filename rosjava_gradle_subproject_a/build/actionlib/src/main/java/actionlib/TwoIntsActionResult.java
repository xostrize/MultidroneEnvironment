package actionlib;

public interface TwoIntsActionResult extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "actionlib/TwoIntsActionResult";
  static final java.lang.String _DEFINITION = "# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\n\nHeader header\nactionlib_msgs/GoalStatus status\nTwoIntsResult result\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  actionlib_msgs.GoalStatus getStatus();
  void setStatus(actionlib_msgs.GoalStatus value);
  actionlib.TwoIntsResult getResult();
  void setResult(actionlib.TwoIntsResult value);
}
