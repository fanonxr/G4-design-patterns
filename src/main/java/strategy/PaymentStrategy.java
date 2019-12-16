package strategy;

public interface PaymentStrategy {
  /** pay method that will be implemented for different strategies */
  public void pay(int amount);
}
