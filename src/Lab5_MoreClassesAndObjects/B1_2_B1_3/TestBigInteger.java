package Lab5_MoreClassesAndObjects.B1_2_B1_3;

import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {

        BigInteger num1 = new BigInteger("11111111111111111111111111111111111111111111111111111111111111");

        BigInteger num2 = new BigInteger("22222222222222222222222222222222222222222222222222");

        System.out.println("Number 1:");
        System.out.println(num1);

        System.out.println();

        System.out.println("Number 2:");
        System.out.println(num2);

        System.out.println();

        System.out.println("Addition:");
        System.out.println(num1.add(num2));

        System.out.println();

        System.out.println("Multiplication:");
        System.out.println(num1.multiply(num2));
    }
}
