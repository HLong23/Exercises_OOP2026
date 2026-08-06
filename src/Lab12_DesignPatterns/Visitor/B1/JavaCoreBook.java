package Lab12_DesignPatterns.Visitor.B1;

public class JavaCoreBook extends ProgrammingBook {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getResource() {
        return "https://docs.oracle.com/javase";
    }

    public String getFavouriteBook() {
        return "Core Java";
    }
}
