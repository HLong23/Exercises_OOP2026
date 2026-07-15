package Lab4_ClassesAndObjects.B2_6_B2_7_B2_8;

public class MainTest {

    public static void main(String[] args) {

        System.out.println("========== MyPoint ==========");

        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(3, 4);

        System.out.println(p1);
        System.out.println(p2);

        p1.setXY(6, 8);

        System.out.println(p1);

        System.out.println("Distance(p1,p2) = "
                + p1.distance(p2));

        System.out.println("Distance to origin = "
                + p1.distance());

        System.out.println("\n========== MyLine ==========");

        MyLine line = new MyLine(
                new MyPoint(1, 2),
                new MyPoint(4, 6));

        System.out.println(line);

        System.out.println("Length = "
                + line.getLength());

        System.out.println("Gradient = "
                + line.getGradient());



        System.out.println("\n========== MyCircle ==========");

        MyCircle c1 = new MyCircle(2, 2, 5);
        MyCircle c2 = new MyCircle(new MyPoint(8, 6), 3);

        System.out.println(c1);
        System.out.println(c2);

        System.out.println("Area = "
                + c1.getArea());

        System.out.println("Circumference = "
                + c1.getCircumference());

        System.out.println("Distance between centers = "
                + c1.distance(c2));
    }
}

