package Lab12_DesignPatterns.Visitor.B1;

public class DesignPatternBook extends ProgrammingBook {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getResource() {
        return "https://refactoring.guru/design-patterns";
    }

    public String getBestSeller() {
        return "Design Patterns";
    }
}
