package Lab12_DesignPatterns.FactoryMethod.B2;

public abstract class AccountFactory {

    public abstract BankAccount createAccount();

    public void openAccount() {
        BankAccount account = createAccount();
        account.accountType();
    }
}
