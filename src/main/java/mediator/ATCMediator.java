package mediator;

public class ATCMediator implements IATCMediator {
  /** Mediator class responsible of handling communication between flight objects */

  private Flight flight;
  private Runway runway;
  public boolean land;

  public void registerRunway(Runway runway) {
    this.runway = runway;
  }

  public void registerFlight(Flight flight) {
    this.flight = flight;
  }

  public boolean isLandingOk() {
    return land;
  }

  @Override
  public void setLandingStatus(boolean status) {
    land = status;
  }
}
