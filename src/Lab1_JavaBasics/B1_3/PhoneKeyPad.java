package Lab1_JavaBasics.B1_3;

import java.util.Scanner;

public class PhoneKeyPad {

    public static String phoneKeyPad(String inStr) {
        inStr = inStr.toLowerCase();

        String result = "";

        for (int i = 0; i < inStr.length(); i++) {
            char c = inStr.charAt(i);

            switch (c) {
                case 'a':
                case 'b':
                case 'c':
                    result += "2";
                    break;

                case 'd':
                case 'e':
                case 'f':
                    result += "3";
                    break;

                case 'g':
                case 'h':
                case 'i':
                    result += "4";
                    break;

                case 'j':
                case 'k':
                case 'l':
                    result += "5";
                    break;

                case 'm':
                case 'n':
                case 'o':
                    result += "6";
                    break;

                case 'p':
                case 'q':
                case 'r':
                case 's':
                    result += "7";
                    break;

                case 't':
                case 'u':
                case 'v':
                    result += "8";
                    break;

                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    result += "9";
                    break;

                default:
                    result += c;
            }
        }

        return result;
    }

    public static void testPhoneKeyPad(Scanner in) {
        System.out.print("Enter a String: ");
        String str = in.nextLine();

        System.out.println("Keypad digits: " + phoneKeyPad(str));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        testPhoneKeyPad(in);

        in.close();
    }
}
