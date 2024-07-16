package lab3.ex3;

import java.util.Scanner;

public class PrimeList {
    public static boolean isPrime(int k) {
        if (k <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(k); i++) {
            if (k % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int upperBound;
        int count = 0;
        double percent;
        System.out.print("Please enter the upper bound: ");
        upperBound = Integer.parseInt(sc.nextLine());
        System.out.println("These numbers are prime: ");
        for (int i = 1; i <= upperBound; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
        }
        percent = (double) count / upperBound * 100;
        System.out.printf("[%d primes found (%.2f%%)]\n", count, percent);
    }
}
