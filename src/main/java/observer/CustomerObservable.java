package observer;

public interface CustomerObservable {
  /** sends the information out to the customer. */
  public void update(Customer customer);
  /** adds the customer to be notified. */
  public void register(CustomerObserver observer);
  /** removes the customer so they will not receive any notifications. */
  public void unRegister(CustomerObserver observer);
}
