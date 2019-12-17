package mediator;

public class Flight implements Command {

  private IATCMediator atcMediator;

  /** You pass the mediator object to the constructor of the objects that are communicating. */
  public Flight(IATCMediator atcMediator) {
    this.atcMediator = atcMediator;
  }

  /** method to communicate with the runway */
  public void land() {
    if (atcMediator.isLandingOk()) {
      System.out.println("Successfully Landed.");
      atcMediator.setLandingStatus(true);
    } else System.out.println("Waiting for landing.");
  }

  public void getReady() {
    System.out.println("Ready for landing.");
  }
}
