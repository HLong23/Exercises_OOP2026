package Lab12_DesignPatterns.Decorator.B2;

public abstract class ToppingDecorator extends IceCream {

    protected IceCream iceCream;

    public ToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription();
    }

    public abstract String addTopping();
}
