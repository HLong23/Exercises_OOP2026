package Lab4_ClassesAndObjects.B1_8;

public class MyPolynomialTest {

    public static void main(String[] args) {

        MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
        MyPolynomial p2 = new MyPolynomial(1.0, 1.0);

        System.out.println("P1 = " + p1);
        System.out.println("P2 = " + p2);

        System.out.println();

        System.out.println("Degree of P1: " + p1.getDegree());

        System.out.println();

        System.out.println("P1(2) = " + p1.evaluate(2));

        System.out.println();

        MyPolynomial sum = p1.add(p2);
        System.out.println("P1 + P2 = " + sum);

        System.out.println();

        MyPolynomial product = p1.multiply(p2);
        System.out.println("P1 * P2 = " + product);
    }
}
