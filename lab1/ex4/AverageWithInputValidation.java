package lab1.ex4;

import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String[] args) {
        final int NUM_STUDENTS = 3;
        int sum = 0;
        double average;

        Scanner sc = new Scanner(System.in);

        for (int studentNo = 1; studentNo <= NUM_STUDENTS; ++studentNo) {
            boolean isValid = false;

            do {
                System.out.print("Enter the mark (0-100) for student " + studentNo + ": ");
                int mark = sc.nextInt();

                if (mark >= 0 && mark <= 100) {
                    sum += mark;
                    isValid = true;
                } else {
                    System.out.println("Invalid input, try again...");
                }
            } while (!isValid);
        }

        average = (double) sum / NUM_STUDENTS;
        System.out.printf("The average is: %.2f", average);

        sc.close();
    }
}
