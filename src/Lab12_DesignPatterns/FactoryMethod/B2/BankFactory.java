package Lab12_DesignPatterns.FactoryMethod.B2;

public class BankFactory extends AccountFactory {

    private String type;

    public BankFactory(String type) {
        this.type = type;
    }

    @Override
    public BankAccount createAccount() {

        if (type.equalsIgnoreCase("saving")) {
            return new SavingAccount();
        }

        if (type.equalsIgnoreCase("current")) {
            return new CurrentAccount();
        }

        throw new IllegalArgumentException("Invalid account type");
    }
}
