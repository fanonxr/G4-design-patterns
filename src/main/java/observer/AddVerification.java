package observer;

public class AddVerification implements CustomerObserver {

  /** method to verify the address for each customer */
  public void update(Customer customer) {
    verifyAddress(customer);
  }

  /** helper method */
  private void verifyAddress(Customer customer) {
    System.out.println("Verifying address " + customer.getEmail() + " for " + customer.getName());
  }
}
