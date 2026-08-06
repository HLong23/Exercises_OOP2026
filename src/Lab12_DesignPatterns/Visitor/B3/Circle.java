package Lab12_DesignPatterns.Visitor.B3;

public class Circle implements Shape {

    private int id;
    private int x;
    private int y;
    private int radius;

    public Circle(int id, int x, int y, int radius) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCircle(this);
    }
}
