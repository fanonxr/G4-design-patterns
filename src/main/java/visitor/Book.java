package visitor;

public class Book implements ItemElement {

  private int price;
  private String isbnNumber;

  public Book(int cost, String isbn) {
    this.price = cost;
    this.isbnNumber = isbn;
  }

  public int getPrice() {
    return price;
  }

  public String getIsbnNumber() {
    return isbnNumber;
  }

  /** have the visit go to this specific object*/
  @Override
  public int accept(ShoppingCartVisitor visitor) {
    return visitor.visit(this);
  }
}
