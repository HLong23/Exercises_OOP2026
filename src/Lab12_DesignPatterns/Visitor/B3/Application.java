package Lab12_DesignPatterns.Visitor.B3;

public class Application {

    public static void main(String[] args) {

        Shape[] shapes = {
                new Dot(1, 5, 8),
                new Circle(2, 10, 20, 15),
                new Rectangle(3, 0, 0, 100, 50)
        };

        Visitor visitor = new XMLExportVisitor();

        for (Shape shape : shapes) {
            shape.accept(visitor);
        }

        System.out.println();

        CompoundShape compound = new CompoundShape(4);
        compound.add(new Dot(5, 2, 3));
        compound.add(new Circle(6, 6, 6, 12));

        compound.accept(visitor);
    }
}
