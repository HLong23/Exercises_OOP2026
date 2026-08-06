package Lab12_DesignPatterns.AbstractFactory.B3;

public class RoundedShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {

        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new RoundedRectangle();
        }

        if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new RoundedSquare();
        }

        return null;
    }

}
