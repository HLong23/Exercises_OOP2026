package Lab12_DesignPatterns.Visitor.B1;

public class VisitorImpl implements Visitor {

    @Override
    public void visit(BusinessBook book) {
        System.out.println("Business Book");
        System.out.println("Publisher: " + book.getPublisher());
        System.out.println();
    }

    @Override
    public void visit(DesignPatternBook book) {
        System.out.println("Design Pattern Book");
        System.out.println("Resource: " + book.getResource());
        System.out.println("Best Seller: " + book.getBestSeller());
        System.out.println();
    }

    @Override
    public void visit(JavaCoreBook book) {
        System.out.println("Java Core Book");
        System.out.println("Resource: " + book.getResource());
        System.out.println("Favourite Book: " + book.getFavouriteBook());
        System.out.println();
    }
}
