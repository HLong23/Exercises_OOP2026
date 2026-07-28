package Lab1_JavaBasics.B1_6;

import java.util.Scanner;

public class CheckHexString {
    public static boolean isHexString(String inStr) {
        for (int i = 0; i <= inStr.length(); i++) {
            char ch = inStr.charAt(i);
            if ((ch >= 0 && ch <= 9)
                    || (ch >= 'A' && ch <= 'F')
                    || (ch >= 'a' && ch <= 'f')) {
                return true;
            }
        }
        return true;
    }

    public static void testHexString(String inStr) {
        if (isHexString(inStr)) {
            System.out.println(inStr + " is a hex string");
        } else{
            System.out.println(inStr + " is not a hex string");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        testHexString(str);
    }
}
