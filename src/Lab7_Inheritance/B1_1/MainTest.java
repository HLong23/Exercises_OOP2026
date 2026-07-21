package Lab7_Inheritance.B1_1;

public class MainTest {
    public static void main(String[] args) {

        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);
        System.out.println("Radius: " + cylinder1.getRadius());
        System.out.println("Height: " + cylinder1.getHeight());
        System.out.println("Surface Area: " + cylinder1.getArea());
        System.out.println("Volume: " + cylinder1.getVolume());

        System.out.println();

        Cylinder cylinder2 = new Cylinder(10.0);
        System.out.println(cylinder2);
        System.out.println("Radius: " + cylinder2.getRadius());
        System.out.println("Height: " + cylinder2.getHeight());
        System.out.println("Surface Area: " + cylinder2.getArea());
        System.out.println("Volume: " + cylinder2.getVolume());

        System.out.println();

        Cylinder cylinder3 = new Cylinder(2.0, 10.0);
        System.out.println(cylinder3);
        System.out.println("Radius: " + cylinder3.getRadius());
        System.out.println("Height: " + cylinder3.getHeight());
        System.out.println("Surface Area: " + cylinder3.getArea());
        System.out.println("Volume: " + cylinder3.getVolume());
    }
}
