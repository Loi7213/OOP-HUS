package lab1.ex4;

import java.util.Scanner;

public class PensionContributionCalculatorWithSentinel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the monthly salary: $");
            int salary = sc.nextInt();

            if (salary == -1) {
                break;
            }
            System.out.print("Enter the age: ");
            int age = sc.nextInt();

            double employeeRate, employerRate;
            if (age <= 55) {
                employeeRate = 0.2;
                employerRate = 0.17;
            } else if (age <= 60) {
                employeeRate = 0.13;
                employerRate = 0.13;
            } else if (age <= 65) {
                employeeRate = 0.075;
                employerRate = 0.09;
            } else {
                employeeRate = 0.05;
                employerRate = 0.075;
            }

            double employeeContribution = salary * employeeRate;
            double employerContribution = salary * employerRate;

            if (employeeContribution > 6000) {
                employeeContribution = 6000;
            }
            if (employerContribution > 6000) {
                employerContribution = 6000;
            }

            System.out.printf("The employee's contribution is: %.2f%n", employeeContribution);
            System.out.printf("The employer's contribution is: %.2f%n", employerContribution);
            System.out.printf("The total contribution is: %.2f%n", employeeContribution + employerContribution);
        }
    }
}
