package Lab1.B1_1;

import java.util.Scanner;

public class ReverseString {

    public static String reverseString(String inStr) {
        String result = "";

        for (int i = inStr.length() - 1; i >= 0; i--) {
            result += inStr.charAt(i);
        }

        return result;
    }

    public static void testReverseString(Scanner in) {
        System.out.print("Enter a String: ");
        String inStr = in.nextLine();

        System.out.println("The reverse of the String \"" + inStr + "\" is \"" + reverseString(inStr) + "\".");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        testReverseString(in);

        in.close();
    }
}
