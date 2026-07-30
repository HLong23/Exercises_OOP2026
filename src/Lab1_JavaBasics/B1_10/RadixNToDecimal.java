package Lab1_JavaBasics.B1_10;

import java.util.Scanner;

public class RadixNToDecimal {

    public static int radixNToDecimal(String radixNStr, int radix) {
        int decimal = 0;
        String str = radixNStr.toUpperCase();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int digit;
            if (c >= '0' && c <= '9') {
                digit = c - '0';
            } else if (c >= 'A' && c <= 'F') {
                digit = 10 + (c - 'A');
            } else {
                return -1; // Invalid character
            }
            if (digit >= radix) {
                return -1; // Digit exceeds radix
            }
            decimal = decimal * radix + digit;
        }
        return decimal;
    }

    public static void testRadixNToDecimal(Scanner in) {
        System.out.print("Enter the radix: ");
        int radix = in.nextInt();
        in.nextLine(); // Consume newline
        System.out.print("Enter the string: ");
        String radixNStr = in.nextLine();
        
        int decimal = radixNToDecimal(radixNStr, radix);
        if (decimal == -1) {
            System.out.println("error: invalid string \"" + radixNStr + "\" for radix " + radix);
        } else {
            System.out.println("The equivalent decimal number \"" + radixNStr + "\" is: " + decimal);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        testRadixNToDecimal(in);
        in.close();
    }
}
