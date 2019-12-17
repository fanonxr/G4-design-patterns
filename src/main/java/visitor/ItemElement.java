package visitor;

public interface ItemElement {
  /** the element that allows the visitor to execute on */
  public int accept(ShoppingCartVisitor visitor);
}
