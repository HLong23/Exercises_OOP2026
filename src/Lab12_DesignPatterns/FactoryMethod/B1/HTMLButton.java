package Lab12_DesignPatterns.FactoryMethod.B1;

public class HTMLButton implements Button {

    @Override
    public void render() {
        System.out.println("Render HTML Button");
    }

    @Override
    public void onClick() {
        System.out.println("HTML Button Clicked");
    }
}
