package Lab1_JavaBasics.B1_2;

import java.util.Scanner;

public class CountVowelsDigits {

    public static int countVowels(String inStr) {
        int count = 0;

        inStr = inStr.toLowerCase();

        for (int i = 0; i < inStr.length(); i++) {
            char c = inStr.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i'
                    || c == 'o' || c == 'u') {
                count++;
            }
        }

        return count;
    }

    public static int countDigits(String inStr) {
        int count = 0;

        for (int i = 0; i < inStr.length(); i++) {
            if (Character.isDigit(inStr.charAt(i))) {
                count++;
            }
        }

        return count;
    }

    public static void testCountVowelsDigits(Scanner in) {
        System.out.print("Enter a String: ");
        String str = in.nextLine();

        int vowels = countVowels(str);
        int digits = countDigits(str);

        double vowelPercent = (double) vowels / str.length() * 100;
        double digitPercent = (double) digits / str.length() * 100;

        System.out.printf("Number of vowels: %d (%.2f%%)\n", vowels, vowelPercent);
        System.out.printf("Number of digits: %d (%.2f%%)\n", digits, digitPercent);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        testCountVowelsDigits(in);

        in.close();
    }
}