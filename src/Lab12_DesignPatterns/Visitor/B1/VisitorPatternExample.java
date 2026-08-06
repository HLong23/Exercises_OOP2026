package Lab12_DesignPatterns.Visitor.B1;

public class VisitorPatternExample {

    public static void main(String[] args) {

        Visitor visitor = new VisitorImpl();

        Book[] books = {
                new BusinessBook(),
                new DesignPatternBook(),
                new JavaCoreBook()
        };

        for (Book book : books) {
            book.accept(visitor);
        }
    }
}
