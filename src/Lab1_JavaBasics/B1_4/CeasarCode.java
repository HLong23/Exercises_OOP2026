package Lab1_JavaBasics.B1_4;

import java.util.Scanner;

public class CeasarCode {
    public static String ceasarCode(String inStr) {
        String result = "";
        inStr = inStr.toUpperCase();

        for (int i = 0; i < inStr.length(); i++) {
            char ch = inStr.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 3);
            } else {
                result += ch;
            }
        }

        return result;
    }

    public  static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = in.nextLine();
        System.out.println("Ceasar Code: " + ceasarCode(str));
    }
}
