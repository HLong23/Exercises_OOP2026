package Lab12_DesignPatterns.Visitor.B3;

public interface Visitor {

    void visitDot(Dot dot);

    void visitCircle(Circle circle);

    void visitRectangle(Rectangle rectangle);

    void visitCompoundShape(CompoundShape compoundShape);
}
