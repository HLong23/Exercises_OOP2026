package Lab1_JavaBasics.B1_5;

import java.util.Scanner;

public class DecipherCaesarCode {
    public static String decipherCaesarCode(String inStr) {
        String result = "";
        inStr = inStr.toUpperCase();

        for (int i = 0; i <= inStr.length() - 1; i++) {
            char ch = inStr.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch - 3);
            } else {
                result += ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Ceasar Code: ");
        String str = in.nextLine();
        System.out.println("String: " + decipherCaesarCode(str));
    }
}
