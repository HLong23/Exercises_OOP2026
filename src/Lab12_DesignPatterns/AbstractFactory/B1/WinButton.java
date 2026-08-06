package Lab12_DesignPatterns.AbstractFactory.B1;

public class WinButton implements Button {

    @Override
    public void paint() {
        System.out.println("Windows Button");
    }
}
