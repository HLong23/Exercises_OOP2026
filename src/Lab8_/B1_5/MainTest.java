package Lab8_.B1_5;

public class MainTest {
    public static void main(String[] args) {

        Circle circle = new Circle(10);

        System.out.println(circle);
        System.out.println("Area = " + circle.getArea());
        System.out.println("Perimeter = " + circle.getPerimeter());

        System.out.println();

        ResizableCircle resizableCircle = new ResizableCircle(10);

        System.out.println(resizableCircle);

        resizableCircle.resize(50);

        System.out.println("After resize 50%:");
        System.out.println(resizableCircle);
        System.out.println("Area = " + resizableCircle.getArea());
        System.out.println("Perimeter = " + resizableCircle.getPerimeter());

        resizableCircle.resize(200);

        System.out.println();

        System.out.println("After resize 200%:");
        System.out.println(resizableCircle);
        System.out.println("Area = " + resizableCircle.getArea());
        System.out.println("Perimeter = " + resizableCircle.getPerimeter());
    }
}
