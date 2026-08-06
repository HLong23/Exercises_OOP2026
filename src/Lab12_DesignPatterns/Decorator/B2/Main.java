package Lab12_DesignPatterns.Decorator.B2;

public class Main {

    public static void main(String[] args) {

        IceCream vanilla = new VanillaIceCream();

        System.out.println(vanilla.getDescription());

        IceCream vanillaHoney = new HoneyToppingDecorator(
                new VanillaIceCream());

        System.out.println(vanillaHoney.getDescription());
        System.out.println(((HoneyToppingDecorator) vanillaHoney).addTopping());

        System.out.println();

        IceCream chocolateHoneyNuts =
                new NutsToppingDecorator(
                        new HoneyToppingDecorator(
                                new ChocolateIceCream()));

        System.out.println(chocolateHoneyNuts.getDescription());

        System.out.println(((HoneyToppingDecorator)
                ((NutsToppingDecorator) chocolateHoneyNuts).iceCream)
                .addTopping());

        System.out.println(((NutsToppingDecorator)
                chocolateHoneyNuts).addTopping());
    }
}
