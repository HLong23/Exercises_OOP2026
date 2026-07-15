package Lab4_ClassesAndObjects.B2_1_B2_2_B2_3;

public class MainTest {

    public static void main(String[] args) {

        Author author1 = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        Author author2 = new Author("Kevin Jones", "kevin@gmail.com", 'm');
        Author author3 = new Author("Mary Smith", "mary@gmail.com", 'f');

        System.out.println(author1);

        Book book1 = new Book("Java for Beginner", author1, 29.95, 99);

        System.out.println(book1);

        System.out.println("Book Name : " + book1.getName());
        System.out.println("Price     : " + book1.getPrice());
        System.out.println("Quantity  : " + book1.getQty());

        System.out.println("Author Name   : " + book1.getAuthorNames());
        System.out.println("Author Email  : " + book1.getAuthorEmails());
        System.out.println("Author Gender : " + book1.getAuthorGenders());

        Author[] authors = {author1, author2, author3};

        Book book2 = new Book("Advanced Java", authors, 49.95, 20);

        System.out.println(book2);

        Book book3 = new Book("9780134685991", "Effective Java", author1, 59.99, 100);

        System.out.println(book3);
        System.out.println("ISBN : " + book3.getISBN());

        Book book4 = new Book("Clean Code", new Author("Robert C. Martin", "unclebob@gmail.com", 'm'), 45.5);

        System.out.println(book4);

        Book book5 = new Book("9781111111111", "Design Patterns", authors, 79.99, 10);

        System.out.println(book5);
    }
}
