package adapter;

public class HdmiPort implements DisplayPort, SoundPort {

  private String soundData;
  private String visualData;

  /**
   * @param soundData the sound the hdmi produces
   * @param visualData the visual the hdmi produces
   */
  public HdmiPort(String visualData, String soundData) {
    this.soundData = soundData;
    this.visualData = visualData;
  }

  @Override
  public void makeSound() {
    System.out.println("Sending sound output from " + soundData);
  }

  @Override
  public void display() {
    System.out.println("Displaying through " + visualData);
  }

  /** @return the soundData */
  public String getSoundData() {
    return soundData;
  }

  /** @param soundData the soundData to set */
  public void setSoundData(String soundData) {
    this.soundData = soundData;
  }

  /** @return the visualData */
  public String getVisualData() {
    return visualData;
  }

  /** @param visualData the visualData to set */
  public void setVisualData(String visualData) {
    this.visualData = visualData;
  }
}
