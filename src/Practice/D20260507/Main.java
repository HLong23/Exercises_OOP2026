package Practice.D20260507;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Circle circle2 = new Circle(5);

        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        System.out.println("Area: " + circle2.getArea());
        System.out.println("Perimeter: " + circle2.getPerimeter());
    }
}
