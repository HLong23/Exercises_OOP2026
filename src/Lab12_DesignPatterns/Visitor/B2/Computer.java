package Lab12_DesignPatterns.Visitor.B2;

public class Computer implements ComputerPart {

    private ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[]{
                new Mouse(),
                new Keyboard(),
                new Monitor()
        };
    }

    @Override
    public void accept(ComputerPartVisitor visitor) {

        for (ComputerPart part : parts) {
            part.accept(visitor);
        }

        visitor.visit(this);
    }
}
