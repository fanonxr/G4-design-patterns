package observer;

public class ObserverExecution {
  public static void main(String[] args){
    // create an online shop to register customers too
    OnlineShop customerDirectory = new OnlineShop();
    // create add verification object
    AddVerification addVerification = new AddVerification();
    // create welcome letter object
    WelcomeLetter welcomeLetter = new WelcomeLetter();

    // register the add verification and the welcome letter
    customerDirectory.register(addVerification);
    customerDirectory.register(welcomeLetter);

    // create a customer object and add them to the customer directory to receive updates
    Customer customer1 = new Customer("Frank","frank@email.com");
    customerDirectory.addCustomer(customer1);
  }
}
