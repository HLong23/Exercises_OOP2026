package Lab6_.polynomial;

/*
 * Đa thức với các hệ số được lưu trong mảng coefficents. Hệ số tự do bắt đầu từ chỉ số 0 của mảng.
 */
public class MyArrayPolynomialTest {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();

        int polyLength1 = random.nextInt(5) + 1;
        int polyLength2 = random.nextInt(5) + 1;

        MyArrayPolynomial poly1 = new MyArrayPolynomial();
        MyArrayPolynomial poly2 = new MyArrayPolynomial();

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
    }
}
