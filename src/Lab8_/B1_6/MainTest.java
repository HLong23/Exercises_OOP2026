package Lab8_.B1_6;

public class MainTest {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.greeting();

        Dog dog = new Dog();
        dog.greeting();

        BigDog bigDog = new BigDog();
        bigDog.greeting();

        System.out.println();

        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
        Animal animal3 = new BigDog();

        animal1.greeting();
        animal2.greeting();
        animal3.greeting();

        System.out.println();

        dog.greeting(bigDog);
        bigDog.greeting(dog);
        bigDog.greeting(bigDog);
    }
}
