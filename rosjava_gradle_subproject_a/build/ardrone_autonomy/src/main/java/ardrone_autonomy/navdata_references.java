package ardrone_autonomy;

public interface navdata_references extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ardrone_autonomy/navdata_references";
  static final java.lang.String _DEFINITION = "Header header\nfloat64 drone_time\nuint16 tag\nuint16 size\nint32 ref_theta\nint32 ref_phi\nint32 ref_theta_I\nint32 ref_phi_I\nint32 ref_pitch\nint32 ref_roll\nint32 ref_yaw\nint32 ref_psi\nfloat32 vx_ref\nfloat32 vy_ref\nfloat32 theta_mod\nfloat32 phi_mod\nfloat32 k_v_x\nfloat32 k_v_y\nuint32 k_mode\nfloat32 ui_time\nfloat32 ui_theta\nfloat32 ui_phi\nfloat32 ui_psi\nfloat32 ui_psi_accuracy\nint32 ui_seq\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  double getDroneTime();
  void setDroneTime(double value);
  short getTag();
  void setTag(short value);
  short getSize();
  void setSize(short value);
  int getRefTheta();
  void setRefTheta(int value);
  int getRefPhi();
  void setRefPhi(int value);
  int getRefThetaI();
  void setRefThetaI(int value);
  int getRefPhiI();
  void setRefPhiI(int value);
  int getRefPitch();
  void setRefPitch(int value);
  int getRefRoll();
  void setRefRoll(int value);
  int getRefYaw();
  void setRefYaw(int value);
  int getRefPsi();
  void setRefPsi(int value);
  float getVxRef();
  void setVxRef(float value);
  float getVyRef();
  void setVyRef(float value);
  float getThetaMod();
  void setThetaMod(float value);
  float getPhiMod();
  void setPhiMod(float value);
  float getKVX();
  void setKVX(float value);
  float getKVY();
  void setKVY(float value);
  int getKMode();
  void setKMode(int value);
  float getUiTime();
  void setUiTime(float value);
  float getUiTheta();
  void setUiTheta(float value);
  float getUiPhi();
  void setUiPhi(float value);
  float getUiPsi();
  void setUiPsi(float value);
  float getUiPsiAccuracy();
  void setUiPsiAccuracy(float value);
  int getUiSeq();
  void setUiSeq(int value);
}
