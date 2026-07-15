package Lab4_ClassesAndObjects.B2_4_B2_5;

public class CustomerAccount {

    private int id;
    private Customer customer;
    private double balance;

    public CustomerAccount(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public CustomerAccount(int id, Customer customer) {
        this(id, customer, 0.0);
    }

    // Getters
    public int getID() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    // Setters
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Helper Methods
    public String getCustomerName() {
        return customer.getName();
    }

    // Deposit
    public CustomerAccount deposit(double amount) {
        balance += amount;
        return this;
    }

    // Withdraw
    public CustomerAccount withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
        return this;
    }

    @Override
    public String toString() {
        return "CustomerAccount[id=" + id
                + ", customer=" + customer
                + ", balance=" + balance + "]";
    }
}
