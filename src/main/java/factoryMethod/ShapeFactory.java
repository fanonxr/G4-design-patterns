package factoryMethod;

public abstract class ShapeFactory {


  /** Concrete Product */
  public static GeometricShape getShape(ShapeType name) {
    // based on what is passed in, it will create that specific shape
    GeometricShape shape = null;
    switch (name) {
      case LINE:
        shape = new Line();
        break;
      case CIRCLE:
        shape = new Circle();
        break;
      case RECTANGLE:
        shape = new Rectangle();
        break;
    }
    return shape;
  }
}
