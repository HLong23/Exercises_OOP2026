package Lab12_DesignPatterns.AbstractFactory.B3;

public class FactoryProducer {

    public static AbstractFactory getFactory(boolean rounded) {

        if (rounded) {
            return new RoundedShapeFactory();
        }

        return new ShapeFactory();
    }

}
