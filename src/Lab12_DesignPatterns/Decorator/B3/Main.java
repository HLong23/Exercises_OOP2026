package Lab12_DesignPatterns.Decorator.B3;

public class Main {

    public static void main(String[] args) {

        String salary = "Employee: Long, Salary: 2000$";

        System.out.println("========== Normal ==========");

        DataSource source = new FileDataSource();
        source.writeData(salary);
        System.out.println(source.readData());

        System.out.println();

        System.out.println("========== Compression ==========");

        source = new CompressionDecorator(
                new FileDataSource());

        source.writeData(salary);
        System.out.println(source.readData());

        System.out.println();

        System.out.println("========== Encryption ==========");

        source = new EncryptionDecorator(
                new FileDataSource());

        source.writeData(salary);
        System.out.println(source.readData());

        System.out.println();

        System.out.println("========== Compression + Encryption ==========");

        source = new EncryptionDecorator(
                new CompressionDecorator(
                        new FileDataSource()));

        source.writeData(salary);
        System.out.println(source.readData());
    }
}
