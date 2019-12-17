package state;

public class AlertStateContext {
  private MobileAlertState currentState;

  // assigning the current state to a vibration
  public AlertStateContext() {
    currentState = new Vibration();
  }

  public void setState(MobileAlertState state) {
    currentState = state;
  }

  public void alert() {
    currentState.alert(this);
  }
}
