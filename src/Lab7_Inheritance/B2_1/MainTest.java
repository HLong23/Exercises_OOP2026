package Lab7_Inheritance.B2_1;

public class MainTest {
    public static void main(String[] args) {

        Point p1 = new Point(10, 20);
        System.out.println(p1);

        p1.setXY(100, 10);
        System.out.println(p1);

        System.out.println();

        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);
        System.out.println("Length = " + l1.getLength());
        System.out.println("Gradient = " + l1.getGradient());

        System.out.println();

        Point p2 = new Point(5, 5);
        Point p3 = new Point(9, 8);

        Line l2 = new Line(p2, p3);
        System.out.println(l2);

        System.out.println();

        LineSub ls = new LineSub(1, 2, 7, 10);
        System.out.println(ls);
        System.out.println("Length = " + ls.getLength());
        System.out.println("Gradient = " + ls.getGradient());
    }
}