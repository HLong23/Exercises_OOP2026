package Lab7_Inheritance.B2_2;

public class MainTest {

    public static void main(String[] args) {

        Cylinder c1 = new Cylinder();
        System.out.println(c1);
        System.out.println("Volume = " + c1.getVolume());

        System.out.println();

        Cylinder c2 = new Cylinder(10);
        System.out.println(c2);
        System.out.println("Volume = " + c2.getVolume());

        System.out.println();

        Cylinder c3 = new Cylinder(5, 8);
        System.out.println(c3);
        System.out.println("Volume = " + c3.getVolume());

        System.out.println();

        Circle circle = new Circle(4, "blue");
        Cylinder c4 = new Cylinder(circle, 6);

        System.out.println(c4);
        System.out.println("Radius = " + c4.getBase().getRadius());
        System.out.println("Color = " + c4.getBase().getColor());
        System.out.println("Volume = " + c4.getVolume());
    }
}
