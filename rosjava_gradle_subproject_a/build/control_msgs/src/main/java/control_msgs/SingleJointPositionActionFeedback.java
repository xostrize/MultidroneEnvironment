package control_msgs;

public interface SingleJointPositionActionFeedback extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "control_msgs/SingleJointPositionActionFeedback";
  static final java.lang.String _DEFINITION = "# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\n\nHeader header\nactionlib_msgs/GoalStatus status\nSingleJointPositionFeedback feedback\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  actionlib_msgs.GoalStatus getStatus();
  void setStatus(actionlib_msgs.GoalStatus value);
  control_msgs.SingleJointPositionFeedback getFeedback();
  void setFeedback(control_msgs.SingleJointPositionFeedback value);
}
