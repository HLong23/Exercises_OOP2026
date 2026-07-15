package Lab5_MoreClassesAndObjects.B1_1;

public class MainTest {
    public static void main(String[] args) {
        MyComplex c1 = new MyComplex(1.1, 2.2);
        MyComplex c2 = new MyComplex(3.3, 4.4);

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

        System.out.println("Real of c1: " + c1.getReal());
        System.out.println("Imag of c1: " + c1.getImag());

        c1.setReal(5.5);
        c1.setImag(6.6);
        System.out.println("After setReal/setImag: " + c1);

        c1.setValue(1.1, 2.2);
        System.out.println("After setValue: " + c1);

        System.out.println("isReal: " + c1.isReal());
        System.out.println("isImaginary: " + c1.isImaginary());

        System.out.println("equals(double,double): " + c1.equals(1.1, 2.2));
        System.out.println("equals(MyComplex): " + c1.equals(c2));

        System.out.println("Magnitude: " + c1.magnitude());
        System.out.println("Argument: " + c1.argument());

        System.out.println("Add: " + c1.addNew(c2));
        System.out.println("Subtract: " + c1.subtractNew(c2));

        MyComplex temp = new MyComplex(1.1, 2.2);

        System.out.println("Multiply: " + temp.multiply(c2));

        temp.setValue(1.1, 2.2);
        System.out.println("Divide: " + temp.divide(c2));

        temp.setValue(1.1, 2.2);
        System.out.println("Conjugate: " + temp.conjugate());
    }
}
