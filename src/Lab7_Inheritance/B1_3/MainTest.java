package Lab7_Inheritance.B1_3;

public class MainTest {
    public static void main(String[] args) {

        Point2D p2 = new Point2D();
        System.out.println(p2);

        p2.setXY(1.5f, 2.5f);
        System.out.println(p2);

        Point2D p3 = new Point2D(5.5f, 6.5f);
        System.out.println(p3);

        System.out.println();

        Point3D point1 = new Point3D();
        System.out.println(point1);

        point1.setXYZ(3.2f, 4.6f, 7.8f);
        System.out.println(point1);

        Point3D point2 = new Point3D(1.1f, 2.2f, 3.3f);
        System.out.println(point2);

        float[] xyz = point2.getXYZ();
        System.out.println("x = " + xyz[0]);
        System.out.println("y = " + xyz[1]);
        System.out.println("z = " + xyz[2]);
    }
}
