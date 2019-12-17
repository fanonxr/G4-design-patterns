package mediator;

public class Runway implements Command {

  private IATCMediator atcMediator;

  /** Passing in the mediator object to */
  public Runway(IATCMediator atcMediator) {
    this.atcMediator = atcMediator;
    atcMediator.setLandingStatus(true);
  }

  @Override
  public void land() {
    System.out.println("Landing permission granted.");
    atcMediator.setLandingStatus(true);
  }
}
