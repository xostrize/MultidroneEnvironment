package ardrone_autonomy;

public interface navdata_hdvideo_stream extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ardrone_autonomy/navdata_hdvideo_stream";
  static final java.lang.String _DEFINITION = "Header header\nfloat64 drone_time\nuint16 tag\nuint16 size\nuint32 hdvideo_state\nuint32 storage_fifo_nb_packets\nuint32 storage_fifo_size\nuint32 usbkey_size\nuint32 usbkey_freespace\nuint32 frame_number\nuint32 usbkey_remaining_time\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  double getDroneTime();
  void setDroneTime(double value);
  short getTag();
  void setTag(short value);
  short getSize();
  void setSize(short value);
  int getHdvideoState();
  void setHdvideoState(int value);
  int getStorageFifoNbPackets();
  void setStorageFifoNbPackets(int value);
  int getStorageFifoSize();
  void setStorageFifoSize(int value);
  int getUsbkeySize();
  void setUsbkeySize(int value);
  int getUsbkeyFreespace();
  void setUsbkeyFreespace(int value);
  int getFrameNumber();
  void setFrameNumber(int value);
  int getUsbkeyRemainingTime();
  void setUsbkeyRemainingTime(int value);
}
