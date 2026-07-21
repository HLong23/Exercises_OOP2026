package Lab7_Inheritance.B1_4;

public class MainTest {
    public static void main(String[] args) {

        Shape shape = new Shape();
        System.out.println(shape);

        Circle circle = new Circle(5, "red", true);
        System.out.println(circle);
        System.out.println("Area = " + circle.getArea());
        System.out.println("Perimeter = " + circle.getPerimeter());

        System.out.println();

        Rectangle rectangle = new Rectangle(4, 6, "blue", false);
        System.out.println(rectangle);
        System.out.println("Area = " + rectangle.getArea());
        System.out.println("Perimeter = " + rectangle.getPerimeter());

        System.out.println();

        Square square = new Square(8, "yellow", true);
        System.out.println(square);
        System.out.println("Area = " + square.getArea());
        System.out.println("Perimeter = " + square.getPerimeter());

        square.setSide(10);
        System.out.println(square);

        square.setWidth(12);
        System.out.println(square);

        square.setLength(15);
        System.out.println(square);
    }
}
