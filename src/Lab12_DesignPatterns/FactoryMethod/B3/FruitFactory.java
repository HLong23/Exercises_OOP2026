package Lab12_DesignPatterns.FactoryMethod.B3;

public class FruitFactory {

    public Fruit provideFruit(String type) {

        if (type == null) {
            return null;
        }

        if (type.equalsIgnoreCase("apple")) {
            return new Apple();
        }

        if (type.equalsIgnoreCase("banana")) {
            return new Banana();
        }

        if (type.equalsIgnoreCase("orange")) {
            return new Orange();
        }

        throw new IllegalArgumentException("Invalid fruit type");
    }
}
