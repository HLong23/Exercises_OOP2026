package Lab4_ClassesAndObjects.B1_7;

public class MyComplexTest {

    public static void main(String[] args) {

        MyComplex c1 = new MyComplex(1.1, 2.2);
        MyComplex c2 = new MyComplex(3.3, 4.4);

        System.out.println(c1);
        System.out.println(c2);

        System.out.println("Real: " + c1.getReal());
        System.out.println("Imag: " + c1.getImag());

        c1.setReal(5.5);
        c1.setImag(6.6);
        System.out.println(c1);

        c1.setValue(1.1, 2.2);
        System.out.println(c1);

        System.out.println("isReal: " + c1.isReal());
        System.out.println("isImaginary: " + c1.isImaginary());

        System.out.println("equals(real, imag): "
                + c1.equals(1.1, 2.2));

        System.out.println("equals(MyComplex): "
                + c1.equals(c2));

        System.out.println("Magnitude: "
                + c1.magnitude());

        System.out.println("addInto:");
        c1.addInto(c2);
        System.out.println(c1);

        c1.setValue(1.1, 2.2);

        System.out.println("addNew:");
        MyComplex c3 = c1.addNew(c2);

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
    }
}
