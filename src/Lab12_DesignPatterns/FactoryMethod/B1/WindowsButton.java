package Lab12_DesignPatterns.FactoryMethod.B1;

public class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("Render Windows Button");
    }

    @Override
    public void onClick() {
        System.out.println("Windows Button Clicked");
    }
}
