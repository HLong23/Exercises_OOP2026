package Lab12_DesignPatterns.FactoryMethod.B1;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
