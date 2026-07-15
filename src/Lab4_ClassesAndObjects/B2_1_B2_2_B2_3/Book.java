package Lab4_ClassesAndObjects.B2_1_B2_2_B2_3;

public class Book {

    private String isbn;
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String isbn, String name, Author[] authors, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public Book(String name, Author author, double price) {
        this(null, name, new Author[]{author}, price, 0);
    }

    public Book(String name, Author author, double price, int qty) {
        this(null, name, new Author[]{author}, price, qty);
    }

    public Book(String name, Author[] authors, double price) {
        this(null, name, authors, price, 0);
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this(null, name, authors, price, qty);
    }

    public Book(String isbn, String name, Author author, double price) {
        this(isbn, name, new Author[]{author}, price, 0);
    }

    public Book(String isbn, String name, Author author, double price, int qty) {
        this(isbn, name, new Author[]{author}, price, qty);
    }

    public String getISBN() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorNames() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < authors.length; i++) {

            sb.append(authors[i].getName());

            if (i < authors.length - 1) {
                sb.append(", ");
            }
        }

        return sb.toString();
    }

    public String getAuthorEmails() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < authors.length; i++) {

            sb.append(authors[i].getEmail());

            if (i < authors.length - 1) {
                sb.append(", ");
            }
        }

        return sb.toString();
    }

    public String getAuthorGenders() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < authors.length; i++) {

            sb.append(authors[i].getGender());

            if (i < authors.length - 1) {
                sb.append(", ");
            }
        }

        return sb.toString();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Book[");

        if (isbn != null) {
            sb.append("isbn=")
                    .append(isbn)
                    .append(", ");
        }

        sb.append("name=")
                .append(name)
                .append(", authors=[");

        for (int i = 0; i < authors.length; i++) {

            sb.append(authors[i]);

            if (i < authors.length - 1) {
                sb.append(", ");
            }
        }

        sb.append("], price=")
                .append(price)
                .append(", qty=")
                .append(qty)
                .append("]");

        return sb.toString();
    }
}
