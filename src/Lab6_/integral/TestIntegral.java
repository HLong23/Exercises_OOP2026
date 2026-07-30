package Lab6_.integral;

public class TestIntegral {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();

        int polyLength1 = random.nextInt(5) + 1;
        int polyLength2 = random.nextInt(5) + 1;

        MyPolynomial poly1 = new MyPolynomial();
        MyPolynomial poly2 = new MyPolynomial();

        for (int i = 0; i < polyLength1; i++) {
            poly1.append(random.nextDouble() * 10);
        }

        for (int i = 0; i < polyLength2; i++) {
            poly2.append(random.nextDouble() * 10);
        }

        System.out.println("Poly1: " + poly1.toString());
        System.out.println("Poly2: " + poly2.toString());

        System.out.println("Poly1 Derivative: " + poly1.derivative().toString());
        System.out.println("Poly2 Derivative: " + poly2.derivative().toString());

        System.out.println("Poly1 + Poly2: " + poly1.plus(poly2).toString());
        System.out.println("Poly1 - Poly2: " + poly1.minus(poly2).toString());
        System.out.println("Poly1 x Poly2: " + poly1.multiply(poly2).toString());

        int index1 = random.nextInt(polyLength1);
        int index2 = random.nextInt(polyLength2);
        double value1 = random.nextDouble() * 10;
        double value2 = random.nextDouble() * 10;

        poly1.set(value1, index1);
        poly2.set(value2, index2);

        System.out.println("Modify Poly1 at index " + index1 + " with the value " + value1 + ": " + poly1.toString());
        System.out.println("Modify Poly2 at index " + index2 + " with the value " + value2 + ": " + poly2.toString());

        double lower1 = 1 + random.nextDouble() * 4;
        double upper1 = 1 + random.nextDouble() * 4;
        double lower2 = 1 + random.nextDouble() * 4;
        double upper2 = 1 + random.nextDouble() * 4;

        IntegralCalculator calc1 = new IntegralCalculator(poly1);
        IntegralCalculator calc2 = new IntegralCalculator(poly2);

        System.out.println("\nIntegral of Poly1 from " + lower1 + " to " + upper1 + ":");
        System.out.println("Midpoint Rule: " + calc1.midpointRule(lower1, upper1));
        System.out.println("Trapezoid Rule: " + calc1.trapezoidRule(lower1, upper1));
        System.out.println("Simpson's Rule: " + calc1.simpsonRule(lower1, upper1));

        System.out.println("\nIntegral of Poly2 from " + lower2 + " to " + upper2 + ":");
        System.out.println("Midpoint Rule: " + calc2.midpointRule(lower2, upper2));
        System.out.println("Trapezoid Rule: " + calc2.trapezoidRule(lower2, upper2));
        System.out.println("Simpson's Rule: " + calc2.simpsonRule(lower2, upper2));
    }
}
