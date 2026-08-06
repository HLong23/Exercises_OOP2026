package Lab12_DesignPatterns.FactoryMethod.B1;

public class Main {

    public static void main(String[] args) {

        Dialog dialog;

        String os = "Windows";

        if (os.equalsIgnoreCase("Windows")) {
            dialog = new WindowsDialog();
        } else if (os.equalsIgnoreCase("Web")) {
            dialog = new WebDialog();
        } else {
            throw new RuntimeException("Unknown operating system");
        }

        dialog.render();

        System.out.println();

        dialog = new WebDialog();
        dialog.render();
    }
}
