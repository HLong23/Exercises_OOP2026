package Lab8_.B1_2;

public class MainTest {
    public static void main(String[] args) {

        GeometricObject circle = new Circle(5.5);

        System.out.println(circle);
        System.out.println("Area = " + circle.getArea());
        System.out.println("Perimeter = " + circle.getPerimeter());

        System.out.println();

        GeometricObject rectangle = new Rectangle(4.0, 6.0);

        System.out.println(rectangle);
        System.out.println("Area = " + rectangle.getArea());
        System.out.println("Perimeter = " + rectangle.getPerimeter());
    }
}
