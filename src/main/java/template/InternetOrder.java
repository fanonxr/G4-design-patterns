package template;

class InternetOrder extends OrderProcessTemplate {
  /** for online orders,
   * this subclass will implement the methods.
   * */
  @Override
  public void doSelect() {
    System.out.println("Item added to online shopping cart");
    System.out.println("Get gift wrap preference");
    System.out.println("Get delivery address.");
  }

  @Override
  public void doPayment() {
    System.out.println("Online Payment through Netbanking, card or Paytm");
  }

  @Override
  public void doDelivery() {
    System.out.println("Ship the item through post to delivery address");
  }
}
