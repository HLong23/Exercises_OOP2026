package Lab4_ClassesAndObjects.B2_4_B2_5;

public class MainTest {

    public static void main(String[] args) {

        System.out.println("===== CUSTOMER =====");

        Customer c1 = new Customer(88, "Tan Ah Teck", 'm', 10);
        Customer c2 = new Customer(99, "Mary Jane", 'f', 20);

        System.out.println(c1);
        System.out.println(c2);

        System.out.println();

        System.out.println("===== INVOICE =====");

        Invoice invoice = new Invoice(1001, c1, 2500);

        System.out.println(invoice);

        System.out.println("Customer ID      : " + invoice.getCustomerID());
        System.out.println("Customer Name    : " + invoice.getCustomerName());
        System.out.println("Discount         : " + invoice.getCustomerDiscount() + "%");
        System.out.println("Amount           : " + invoice.getAmount());
        System.out.println("After Discount   : " + invoice.getAmountAfterDiscount());

        System.out.println();

        System.out.println("===== ACCOUNT =====");

        CustomerAccount account = new CustomerAccount(2001, c1, 1000);

        System.out.println(account);

        account.deposit(500);
        System.out.println("After deposit :");
        System.out.println(account);

        account.withdraw(300);
        System.out.println("After withdraw :");
        System.out.println(account);

        account.withdraw(5000);

        System.out.println(account);

        System.out.println();

        CustomerAccount account2 = new CustomerAccount(2002, c2);

        account2.deposit(2000);

        System.out.println(account2);
    }
}


