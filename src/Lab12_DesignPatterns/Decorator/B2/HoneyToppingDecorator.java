package Lab12_DesignPatterns.Decorator.B2;

public class HoneyToppingDecorator extends ToppingDecorator {

    public HoneyToppingDecorator(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", Honey";
    }

    @Override
    public String addTopping() {
        return "Honey added";
    }
}
