package Lab1_JavaBasics.B3_1;

import java.util.Scanner;

public class MagicSum {

    public static boolean hasEight(int number) {
        while (number != 0) {
            int digit = number % 10;
            if (digit == 8) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

    public static int testMagicSum(Scanner in) {
        System.out.println("Enter a positive integer (or -1 to end): ");
        int sum = 0;
        
        while (true) {
            int number = in.nextInt();
            if (number == -1) {
                break;
            }
            if (hasEight(number)) {
                sum += number;
            }
        }
        
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int magicSum = testMagicSum(in);
        System.out.println("The magic sum is: " + magicSum);
        in.close();
    }
}
