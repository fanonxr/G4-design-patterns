package template;

public class TemplateExecution {
  public static void main(String[] args) {
    /* declare the type as the parent class. */
    OrderProcessTemplate netOrder = new InternetOrder();
    netOrder.processOrder(true);
    System.out.println();
    OrderProcessTemplate storeOrder = new StoreOrder();
    storeOrder.processOrder(true);
  }
}
