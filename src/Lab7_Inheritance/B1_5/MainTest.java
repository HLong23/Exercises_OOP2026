package Lab7_Inheritance.B1_5;

public class MainTest {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal");
        System.out.println(animal);

        Mammal mammal = new Mammal("Elephant");
        System.out.println(mammal);

        Cat cat = new Cat("Kitty");
        System.out.println(cat);
        cat.greets();

        System.out.println();

        Dog dog1 = new Dog("Tom");
        Dog dog2 = new Dog("Jerry");

        System.out.println(dog1);
        dog1.greets();
        dog1.greets(dog2);
    }
}
