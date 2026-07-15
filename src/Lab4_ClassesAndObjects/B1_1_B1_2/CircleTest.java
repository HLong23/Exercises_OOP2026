package Lab4_ClassesAndObjects.B1_1_B1_2;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle.setRadius(5);
        circle.setColor("blue");
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Color: " + circle.getColor());
    }
}
