package Lab12_DesignPatterns.Visitor.B1;

public class BusinessBook implements Book {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getPublisher() {
        return "Pearson";
    }
}
