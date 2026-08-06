package Lab12_DesignPatterns.FactoryMethod.B2;

public class Main {

    public static void main(String[] args) {

        AccountFactory savingFactory = new BankFactory("saving");
        savingFactory.openAccount();

        AccountFactory currentFactory = new BankFactory("current");
        currentFactory.openAccount();
    }
}
