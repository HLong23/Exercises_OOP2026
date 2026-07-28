package Lab1_JavaBasics.B1_7;

import java.util.Scanner;

public class BinaryToDecimal {
    public static int binaryToDecimal(String inStr) {
        int result = 0;
        int pow = 0;

        for(int i = 0; i < inStr.length(); i++) {
            char ch = inStr.charAt(i);
            if(ch == 1){
                result += Math.pow(2, pow);
                pow++;
            } else {
                pow++;
            }
        }
        return result;
    }

    public static void testBinaryToDecimal(String in) {
        for (int i = 0; i <= in.length(); i++) {
            char ch = in.charAt(i);
            if (ch != 0 && ch != 1) {
                System.out.println("error: invalid binary string: " + in);
            }
            return;
        }

        int result = binaryToDecimal(in);
        System.out.println("The equivalent decimal number for binary " + in + " is " + result);
    }

    public static void main(String[] args) {
        System.out.print("Enter a binary string: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        testBinaryToDecimal(str);
    }
}
