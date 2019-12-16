package observer;

import java.util.ArrayList;
import java.util.List;

public class OnlineShop implements CustomerObservable {

  private List<Customer> customers = new ArrayList<Customer>();
  private List<CustomerObserver> customerObservers = new ArrayList<CustomerObserver>();

  /**
   * Update the online shop with the new customer */
  public void update(Customer customer) {
    for (CustomerObserver observer: customerObservers) {
      observer.update(customer);
    }
  }

  public void register(CustomerObserver observer) {
    customerObservers.add(observer);
  }

  public void unRegister(CustomerObserver observer) {
    customerObservers.remove(observer);
  }

  public void addCustomer(Customer customer) {
    customers.add(customer);
    update(customer);

  }

  public void removeCustomer(Customer customer) {
    customers.remove(customer);
  }

}
