package abstractFactory;

/**
 * Concrete product
 */
public class Sphere implements GeometricShape {
  @Override
  public void draw() {
    System.out.println("Sphere drawn.");
  }
}
