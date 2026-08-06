package Lab12_DesignPatterns.Visitor.B2;

public class VisitorPatternDemo {

    public static void main(String[] args) {

        ComputerPart computer = new Computer();

        computer.accept(new ComputerPartDisplayVisitor());
    }
}
