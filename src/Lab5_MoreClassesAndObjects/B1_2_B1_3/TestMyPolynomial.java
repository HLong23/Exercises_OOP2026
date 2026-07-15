package Lab5_MoreClassesAndObjects.B1_2_B1_3;

public class TestMyPolynomial {
    public static void main(String[] args) {

        MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
        MyPolynomial p2 = new MyPolynomial(2.0, 1.0, 4.0);

        System.out.println("Polynomial 1: " + p1);
        System.out.println("Polynomial 2: " + p2);

        System.out.println("Degree of p1: " + p1.getDegree());

        System.out.println("p1(2) = " + p1.evaluate(2));

        System.out.println("Addition:");
        System.out.println(p1.add(p2));

        System.out.println("Multiplication:");
        System.out.println(p1.multiply(p2));
    }
}
