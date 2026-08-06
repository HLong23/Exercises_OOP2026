package Lab12_DesignPatterns.Visitor.B3;

public class XMLExportVisitor implements Visitor {

    @Override
    public void visitDot(Dot dot) {
        System.out.println("<dot id=\"" + dot.getId() +
                "\" x=\"" + dot.getX() +
                "\" y=\"" + dot.getY() + "\"/>");
    }

    @Override
    public void visitCircle(Circle circle) {
        System.out.println("<circle id=\"" + circle.getId() +
                "\" x=\"" + circle.getX() +
                "\" y=\"" + circle.getY() +
                "\" radius=\"" + circle.getRadius() + "\"/>");
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        System.out.println("<rectangle id=\"" + rectangle.getId() +
                "\" x=\"" + rectangle.getX() +
                "\" y=\"" + rectangle.getY() +
                "\" width=\"" + rectangle.getWidth() +
                "\" height=\"" + rectangle.getHeight() + "\"/>");
    }

    @Override
    public void visitCompoundShape(CompoundShape compoundShape) {

        System.out.println("<compound id=\"" + compoundShape.getId() + "\">");

        for (Shape shape : compoundShape.getChildren()) {
            shape.accept(this);
        }

        System.out.println("</compound>");
    }
}
