package state;

public class Vibration implements MobileAlertState {

  /** vibrating state. */
  @Override
  public void alert(AlertStateContext context) {
    System.out.println("Vibrating...");
  }
}
