package lab3.ex3;

import java.util.Scanner;

public class PerfectPrimeFactorList {
    public static boolean isProductOfPrimeFactors(int number) {
        if (number <= 0)
            return false;
        if (isPrime(number))
            return false;
        for (int i = 2; i <= number / 2; i++) {
            if (isPrime(i)) {
                if (number % (i * i) == 0)
                    return false;
            }
        }
        return true;
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int UPPER_BOUND;
        int count = 0;
        double percent;

        System.out.print("Enter the upper bound: ");
        UPPER_BOUND = sc.nextInt();

        System.out.println("These number are equal to the product of prime factors: ");
        for (int i = 1; i <= UPPER_BOUND; i++) {
            if (isProductOfPrimeFactors(i)) {
                System.out.print(i + " ");
                count++;
            }
        }

        percent = (double) count / UPPER_BOUND * 100;
        System.out.printf("\n[%d numbers found (%2.2f%%)]\n", count, percent);
    }
}
