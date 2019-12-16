package observer;

public class WelcomeLetter implements CustomerObserver {

  /** method to welcome the customer to the one line shop*/
  public void update(Customer customer) {
    generateLetter(customer);
  }

  private void generateLetter(Customer customer){
    System.out.println("Generating letter for " + customer.getName());
  }
}
