package Lab1_JavaBasics.B1_9;

import java.util.Scanner;

public class OctalToDecimal {

    public static int octalToDecimal(String octalStr) {
        int decimal = 0;
        for (int i = 0; i < octalStr.length(); i++) {
            char octalChar = octalStr.charAt(i);
            if (octalChar >= '0' && octalChar <= '7') {
                int digit = octalChar - '0';
                decimal = decimal * 8 + digit;
            } else {
                return -1; // Invalid octal character
            }
        }
        return decimal;
    }

    public static void testOctalToDecimal(Scanner in) {
        System.out.print("Enter an Octal string: ");
        String octalStr = in.nextLine();
        int decimal = octalToDecimal(octalStr);
        if (decimal == -1) {
            System.out.println("error: invalid octal string \"" + octalStr + "\"");
        } else {
            System.out.println("The equivalent decimal number \"" + octalStr + "\" is: " + decimal);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        testOctalToDecimal(in);
        in.close();
    }
}
