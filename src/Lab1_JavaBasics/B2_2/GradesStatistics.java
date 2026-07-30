package Lab1_JavaBasics.B2_2;

import java.util.Scanner;

public class GradesStatistics {

    public static int[] generateStudentGrades(Scanner in) {
        System.out.print("Enter the number of students: ");
        int numStudents = in.nextInt();
        
        int[] grades = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            grades[i] = in.nextInt();
        }
        
        return grades;
    }

    public static void simpleGradesStatistics(int[] grades) {
        if (grades.length == 0) {
            System.out.println("No grades entered.");
            return;
        }

        int sum = 0;
        int min = grades[0];
        int max = grades[0];

        for (int grade : grades) {
            sum += grade;
            if (grade < min) {
                min = grade;
            }
            if (grade > max) {
                max = grade;
            }
        }

        double average = (double) sum / grades.length;

        System.out.printf("The average is: %.2f\n", average);
        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] grades = generateStudentGrades(in);
        simpleGradesStatistics(grades);
        
        in.close();
    }
}
