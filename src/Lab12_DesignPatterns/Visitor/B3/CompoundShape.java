package Lab12_DesignPatterns.Visitor.B3;

import java.util.ArrayList;
import java.util.List;

public class CompoundShape implements Shape {

    private int id;
    private List<Shape> children = new ArrayList<>();

    public CompoundShape(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public List<Shape> getChildren() {
        return children;
    }

    public void add(Shape shape) {
        children.add(shape);
    }

    @Override
    public void move(int x, int y) {
    }

    @Override
    public void draw() {
        System.out.println("Draw Compound Shape");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCompoundShape(this);
    }
}
