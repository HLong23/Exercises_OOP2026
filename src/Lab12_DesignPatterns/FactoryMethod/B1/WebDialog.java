package Lab12_DesignPatterns.FactoryMethod.B1;

public class WebDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
