package Lab5_MoreClassesAndObjects.B1_1;

import java.util.Scanner;

public class MyComplexApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter complex number 1 (real and imaginary part): ");
        double real1 = sc.nextDouble();
        double imag1 = sc.nextDouble();

        System.out.print("Enter complex number 2 (real and imaginary part): ");
        double real2 = sc.nextDouble();
        double imag2 = sc.nextDouble();

        MyComplex number1 = new MyComplex(real1, imag1);
        MyComplex number2 = new MyComplex(real2, imag2);

        System.out.println();

        System.out.println("Number 1 is: " + number1);
        if (number1.isReal()) {
            System.out.println(number1 + " is a pure real number");
        } else {
            System.out.println(number1 + " is NOT a pure real number");
        }

        if (number1.isImaginary()) {
            System.out.println(number1 + " is a pure imaginary number");
        } else {
            System.out.println(number1 + " is NOT a pure imaginary number");
        }

        System.out.println();

        System.out.println("Number 2 is: " + number2);
        if (number2.isReal()) {
            System.out.println(number2 + " is a pure real number");
        } else {
            System.out.println(number2 + " is NOT a pure real number");
        }

        if (number2.isImaginary()) {
            System.out.println(number2 + " is a pure imaginary number");
        } else {
            System.out.println(number2 + " is NOT a pure imaginary number");
        }

        System.out.println();

        if (number1.equals(number2)) {
            System.out.println(number1 + " is equal to " + number2);
        } else {
            System.out.println(number1 + " is NOT equal to " + number2);
        }

        System.out.println(number1 + " + " + number2 + " = " + number1.addNew(number2));

        sc.close();
    }
}
