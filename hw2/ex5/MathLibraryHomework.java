package hw2.ex5;

import java.util.Scanner;

public class MathLibraryHomework {
    public static void main(String[] args) {
        System.out.println("Computing: sin(x) and cos(x)");
        testTrigonometric();

        System.out.println();

        System.out.println("The Exponential Series program!");
        testSpecialSeries();

        System.out.println();

        System.out.println("Factorial programs!");
        factorialInt();
        System.out.println();
        factorialLong();

        System.out.println();

        System.out.println("The Fibonacci Program!");
        fibonacciInt();
        System.out.println();
        System.out.println("The Tribonacci program!");
        tribonacciInt();

        System.out.println();

        System.out.println("The Number System Conversion program!");
        testNumberConversion();
    }

    public static double sin(double x, int numTerms) {
        double result = x;
        double term = x;
        int sign = -1;
        for (int i = 3; i <= numTerms; i += 2) {
            term *= (x * x) / (i * (i - 1));
            result += sign * term;
            sign *= -1;
        }
        return result;
    }

    public static double cos(double x, int numTerms) {
        double result = 1.0;
        double term = 1.0;
        int sign = -1;
        for (int i = 2; i <= numTerms; i += 2) {
            term *= (x * x) / (i * (i - 1));
            result += sign * term;
            sign *= -1;
        }
        return result;
    }

    public static void testTrigonometric() {
        double[] xValues = { 0, Math.PI / 6, Math.PI / 4, Math.PI / 3, Math.PI / 2 };
        int[] numTermsValues = { 5, 10, 15 };
        for (double x : xValues) {
            System.out.println("x = " + x);
            for (int numTerms : numTermsValues) {
                double seriesSin = sin(x, numTerms);
                double jdkSin = Math.sin(x);
                System.out.println("  Number of terms: " + numTerms);
                System.out.println("  Series sin(x): " + seriesSin);
                System.out.println("  JDK sin(x): " + jdkSin);
            }
            System.out.println();
        }

        for (double x : xValues) {
            System.out.println("x = " + x);
            for (int numTerms : numTermsValues) {
                double seriesCos = cos(x, numTerms);
                double jdkCos = Math.cos(x);
                System.out.println("  Number of terms: " + numTerms);
                System.out.println("  Series cos(x): " + seriesCos);
                System.out.println("  JDK cos(x): " + jdkCos);
            }
            System.out.println();
        }
    }

    public static double specialSeries(double x, int numTerms) {
        double result = x;
        double term = x;
        int denominator = 2;
        int sign = -1;
        for (int i = 2; i <= numTerms; i++) {
            term *= (denominator * x) / ((denominator + 1) * i);
            result += sign * term;
            denominator += 2;
            sign *= -1;
        }
        return result;
    }

    public static void testSpecialSeries() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        double x = sc.nextDouble();

        System.out.print("Enter the number of terms: ");
        int numTerms = sc.nextInt();

        double seriesSum = specialSeries(x, numTerms);
        System.out.println("Sum of the series: " + seriesSum);
    }

    public static void factorialInt() {
        int max = Integer.MAX_VALUE;
        long factorial = 1;
        for (int i = 1;; i++) {
            factorial *= i;
            if (factorial > max) {
                System.out.println("The factorial of " + i + " is out of range");
                break;
            } else {
                System.out.println("The factorial of " + i + " is " + factorial);
            }
        }
    }

    public static void factorialLong() {
        long max = Long.MAX_VALUE;
        long factorial = 1;
        for (int i = 1;; i++) {
            factorial *= i;
            if (max / factorial < (i + 1)) {
                System.out.println("The factorial of " + i + " is out of range");
                break;
            } else {
                System.out.println("The factorial of " + i + " is " + factorial);
            }
        }
    }

    public static void fibonacciInt() {
        int prev = 1;
        int current = 1;
        int count = 2;
        System.out.println("F(0) = " + prev);
        System.out.println("F(1) = " + current);
        while (true) {
            int next = prev + current;
            if (next < 0) {
                System.out.println("F(" + count + ") is out of the range of int");
                break;
            }
            System.out.println("F(" + count + ") = " + next);
            prev = current;
            current = next;
            count++;
        }
    }

    public static void tribonacciInt() {
        int prev1 = 1;
        int prev2 = 1;
        int current = 2;
        int count = 3;
        System.out.println("T(0) = " + prev1);
        System.out.println("T(1) = " + prev2);
        System.out.println("T(2) = " + current);
        while (true) {
            int next = prev1 + prev2 + current;
            if (next < 0) {
                System.out.println("T(" + count + ") is out of the range of int");
                break;
            }
            System.out.println("T(" + count + ") = " + next);
            prev1 = prev2;
            prev2 = current;
            current = next;
            count++;
        }
    }

    public static String toRadix(String in, int inRadix, int outRadix) {
        int decimalValue = Integer.parseInt(in, inRadix);
        return Integer.toString(decimalValue, outRadix);
    }

    public static void testNumberConversion() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number and radix: ");
        String number = sc.next();

        System.out.print("Enter the input radix: ");
        int inRadix = sc.nextInt();

        System.out.print("Enter the output radix: ");
        int outRadix = sc.nextInt();

        String convertedNumber = toRadix(number, inRadix, outRadix);
        System.out.println("\"" + number + "\" in radix " + inRadix
                + " is \"" + convertedNumber + "\" in radix " + outRadix);
    }
}
