package factoryMethod;

public class FactoryExecution {
  public static void main(String[] args) {
    //requests for circle shape
    GeometricShape circle = ShapeFactory.getShape(ShapeType.CIRCLE);
    circle.draw();

    GeometricShape rectangle = ShapeFactory.getShape(ShapeType.RECTANGLE);
    rectangle.draw();
  }
}
