package template;

public abstract class OrderProcessTemplate {
  public boolean isGift;

  /** leaving the subclassing to implement these methods */
  public abstract void doSelect();

  public abstract void doPayment();

  public abstract void doDelivery();

  public final void giftWrap() {
    try {
      System.out.println("Gift wrap successful");
    } catch (Exception e) {
      System.out.println("Gift wrap unsuccessful");
    }
  }

  /**
   * the template in which the order will be executed. */
  public final void processOrder(boolean isGift) {
    doSelect();
    doPayment();
    if (isGift) {
      giftWrap();
    }
    doDelivery();
  }
}
