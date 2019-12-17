package template;

class StoreOrder extends OrderProcessTemplate {
  /** for in store orders
   * sub class handles implementation of the method
   * */

  @Override
  public void doSelect() {
    System.out.println("Customer chooses the item from shelf.");
  }

  @Override
  public void doPayment() {
    System.out.println("Pays at counter through cash/POS");
  }

  @Override
  public void doDelivery() {
    System.out.println("Item deliverd to in delivery counter.");
  }
}
