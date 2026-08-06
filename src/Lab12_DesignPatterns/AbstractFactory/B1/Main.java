package Lab12_DesignPatterns.AbstractFactory.B1;

public class Main {

    public static void main(String[] args) {

        GUIFactory factory;

        String os = "Windows";

        if (os.equalsIgnoreCase("Windows")) {
            factory = new WinFactory();
        } else {
            factory = new MacFactory();
        }

        Application app = new Application(factory);

        app.createUI();

        app.paint();

    }

}
