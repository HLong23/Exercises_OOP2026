package Lab12_DesignPatterns.Decorator.B2;

public class NutsToppingDecorator extends ToppingDecorator {

    public NutsToppingDecorator(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", Nuts";
    }

    @Override
    public String addTopping() {
        return "Nuts added";
    }
}
