package Lab1_JavaBasics.B1_8;

import java.util.Scanner;

public class HexadecimalToDecimal {

    public static int hexadecimalToDecimal(String hexStr) {
        int decimal = 0;
        String hex = hexStr.toUpperCase();
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            int digit;
            if (hexChar >= '0' && hexChar <= '9') {
                digit = hexChar - '0';
            } else if (hexChar >= 'A' && hexChar <= 'F') {
                digit = 10 + (hexChar - 'A');
            } else {
                return -1; // Invalid hexadecimal character
            }
            decimal = decimal * 16 + digit;
        }
        return decimal;
    }

    public static void testHexadecimalToDecimal(Scanner in) {
        System.out.print("Enter a Hexadecimal string: ");
        String hexStr = in.nextLine();
        int decimal = hexadecimalToDecimal(hexStr);
        if (decimal == -1) {
            System.out.println("error: invalid hexadecimal string \"" + hexStr + "\"");
        } else {
            System.out.println("The equivalent decimal number for hexadecimal \"" + hexStr + "\" is: " + decimal);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        testHexadecimalToDecimal(in);
        in.close();
    }
}
