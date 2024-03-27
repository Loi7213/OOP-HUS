package lab1.ex3;

import java.util.Scanner;

public class ComputePI {
    public static void maxDenominator(int MAX_DENOMINATOR) {
        double sum = 0.0;

        for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2) {
            if (denominator % 4 == 1) {
                sum += (1.0 / denominator);
            } else if (denominator % 4 == 3) {
                sum -= (1.0 / denominator);
            } else {
                System.out.println("Impossible!!!");
            }
        }

        double pi = 4 * sum;
        System.out.println("PI = " + pi);
    }

    public static void maxTerm(int MAX_TERM) {
        double sum = 0.0;

        for (int term = 1; term <= MAX_TERM; term++) {
            if (term % 2 == 1) {
                sum += (1.0 / (term * 2 - 1));
            } else {
                sum -= (1.0 / (term * 2 - 1));
            }
        }

        double pi = 4 * sum;
        System.out.println("PI = " + pi);
    }

    public static void main(String[] args) {
        System.out.print("The maximum denominator is: ");
        Scanner sc1 = new Scanner(System.in);
        int MAX_DENOMINATOR = sc1.nextInt();

        System.out.print("The max term is: ");
        Scanner sc2 = new Scanner(System.in);
        int MAX_TERM = sc2.nextInt();

        System.out.print("PI computed by the maximum denominator (" + MAX_DENOMINATOR + ") is: ");
        maxDenominator(MAX_DENOMINATOR);

        System.out.print("PI computed by the maximum number of terms (" + MAX_TERM + ") is: ");
        maxTerm(MAX_TERM);

        System.out.println();
        double pi = Math.PI;
        System.out.println("PI computed by JDK is: " + pi);
    }
}
