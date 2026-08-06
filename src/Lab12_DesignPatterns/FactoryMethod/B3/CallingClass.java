package Lab12_DesignPatterns.FactoryMethod.B3;

public class CallingClass {

    public static void main(String[] args) {

        FruitFactory factory = new FruitFactory();

        Fruit fruit1 = factory.provideFruit("apple");
        fruit1.produceJuice();

        Fruit fruit2 = factory.provideFruit("banana");
        fruit2.produceJuice();

        Fruit fruit3 = factory.provideFruit("orange");
        fruit3.produceJuice();
    }
}
