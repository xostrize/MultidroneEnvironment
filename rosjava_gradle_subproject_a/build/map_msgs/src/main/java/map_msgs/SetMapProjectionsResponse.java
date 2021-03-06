package map_msgs;

public interface SetMapProjectionsResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "map_msgs/SetMapProjectionsResponse";
  static final java.lang.String _DEFINITION = "map_msgs/ProjectedMapInfo[] projected_maps_info";
  java.util.List<map_msgs.ProjectedMapInfo> getProjectedMapsInfo();
  void setProjectedMapsInfo(java.util.List<map_msgs.ProjectedMapInfo> value);
}
