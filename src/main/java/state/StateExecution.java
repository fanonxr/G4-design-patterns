package state;

public class StateExecution {
  public static void main(String[] args) {
    AlertStateContext stateContext = new AlertStateContext();
    stateContext.alert();
    stateContext.alert();
    // at the vibration state

    // assigning the silent state
    stateContext.setState(new Silent());
    stateContext.alert();
    stateContext.alert();
    stateContext.alert();
  }
}
