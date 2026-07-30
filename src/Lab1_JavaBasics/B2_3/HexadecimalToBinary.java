package Lab1_JavaBasics.B2_3;

import java.util.Scanner;

public class HexadecimalToBinary {

    public static String hexadecimalToBinary(String hexStr) {
        StringBuilder binary = new StringBuilder();
        String hex = hexStr.toUpperCase();
        
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            String binaryDigit;
            
            switch (hexChar) {
                case '0': binaryDigit = "0000"; break;
                case '1': binaryDigit = "0001"; break;
                case '2': binaryDigit = "0010"; break;
                case '3': binaryDigit = "0011"; break;
                case '4': binaryDigit = "0100"; break;
                case '5': binaryDigit = "0101"; break;
                case '6': binaryDigit = "0110"; break;
                case '7': binaryDigit = "0111"; break;
                case '8': binaryDigit = "1000"; break;
                case '9': binaryDigit = "1001"; break;
                case 'A': binaryDigit = "1010"; break;
                case 'B': binaryDigit = "1011"; break;
                case 'C': binaryDigit = "1100"; break;
                case 'D': binaryDigit = "1101"; break;
                case 'E': binaryDigit = "1110"; break;
                case 'F': binaryDigit = "1111"; break;
                default: binaryDigit = null; break;
            }
            
            if (binaryDigit == null) {
                return null; // Invalid hexadecimal character
            }
            
            binary.append(binaryDigit);
            if (i < hex.length() - 1) {
                binary.append(" ");
            }
        }
        
        return binary.toString();
    }

    public static void testHexadecimalToBinary(Scanner in) {
        System.out.print("Enter a Hexadecimal string: ");
        String hexStr = in.nextLine();
        
        String binary = hexadecimalToBinary(hexStr);
        if (binary == null) {
            System.out.println("error: invalid hexadecimal string \"" + hexStr + "\"");
        } else {
            System.out.println("The equivalent binary for hexadecimal \"" + hexStr + "\" is: " + binary);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        testHexadecimalToBinary(in);
        in.close();
    }
}
