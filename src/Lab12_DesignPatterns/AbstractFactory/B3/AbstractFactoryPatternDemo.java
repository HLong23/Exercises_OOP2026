package Lab12_DesignPatterns.AbstractFactory.B3;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();

        System.out.println();

        AbstractFactory roundedFactory = FactoryProducer.getFactory(true);

        Shape shape3 = roundedFactory.getShape("RECTANGLE");
        shape3.draw();

        Shape shape4 = roundedFactory.getShape("SQUARE");
        shape4.draw();

    }

}
