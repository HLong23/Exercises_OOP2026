package Lab12_DesignPatterns.FactoryMethod.B2;

public class SavingAccount implements BankAccount {

    @Override
    public void accountType() {
        System.out.println("Saving Account Created");
    }
}
