package Lab12_DesignPatterns.Visitor.B3;

public interface Shape {

    void move(int x, int y);

    void draw();

    void accept(Visitor visitor);
}
