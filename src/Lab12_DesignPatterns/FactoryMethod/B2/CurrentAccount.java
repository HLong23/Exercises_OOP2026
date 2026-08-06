package Lab12_DesignPatterns.FactoryMethod.B2;

public class CurrentAccount implements BankAccount {

    @Override
    public void accountType() {
        System.out.println("Current Account Created");
    }
}
