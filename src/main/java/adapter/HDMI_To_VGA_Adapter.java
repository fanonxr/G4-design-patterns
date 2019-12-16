package adapter;

public class HDMI_To_VGA_Adapter implements DisplayPort, SoundPort {

  private VGA_Port vgaPort;

  /**
   * Takes in the VGA port because this is what it is adapting too. */
  public HDMI_To_VGA_Adapter(VGA_Port vgaPort) {
    this.setVgaPort(vgaPort);
  }

  @Override
  public void display() {
    vgaPort.display();
  }

  @Override
  public void makeSound() {
    System.out.println("No sound can be transfered by VGA port.");
  }

  /**
   * Fist adapt the port and then display it.
   *
   * @param hdmi port
   */
  public void adapt(HdmiPort hdmi) {
    // gets the visual data from the HDMI and converts it to VGA
    vgaPort.setVisualData(hdmi.getVisualData());
    this.display();
    this.makeSound();
  }

  /**
   * @return the vgaPort
   */
  public VGA_Port getVgaPort() {
    return vgaPort;
  }

  /**
   * @param vgaPort
   *            the vgaPort to set
   */
  public void setVgaPort(VGA_Port vgaPort) {
    this.vgaPort = vgaPort;
  }

}
