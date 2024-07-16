package lab3.ex1;

import java.util.Scanner;

public class ExercisesOnRecursion {
    public static void main(String[] args) {
        System.out.println("The Factoriac program!");
        testFactorial();

        System.out.println();

        System.out.println("The Fibonacci program!");
        testFibonaccil();

        System.out.println();

        System.out.println("The NumberLength program!");
        testLen();

        System.out.println();

        System.out.println("The GCD program!");
        testGCD();
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void testFactorial() {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The factorial of " + n + " is: " + factorial(n));
    }

    public static int fibonacci (int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void testFibonaccil() {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The fibonacci of " + n + " is: " + fibonacci(n));
    }

    public static int len(int n) {
        if (n == 1) {
            return 1;
        } else {
            return len(n-1) + numOfDigits(n);
        }
    }

    public static int numOfDigits(int n) {
        return String.valueOf(n).length();
    }

    public static void testLen() {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The length of S(" + n + ") is: " + len(n));
    }

    public static int gcd(int a, int b) {
        if (b > 0) {
            return gcd(b, a % b);
        }
        else {
            return a;
        }
    }

    public static int testGCD() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println("The greatest common divisor of " + a + " and " + b + " is: " + gcd(a, b));
        return a;
    }
}
