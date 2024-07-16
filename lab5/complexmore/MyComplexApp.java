package lab5.complexmore;

import java.util.Scanner;

public class MyComplexApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the real part of Complex 1: ");
        double real1 = scanner.nextDouble();

        System.out.print("Enter the imaginary part of Complex 1: ");
        double imag1 = scanner.nextDouble();

        System.out.print("Enter the real part of Complex 2: ");
        double real2 = scanner.nextDouble();

        System.out.print("Enter the imaginary part of Complex 2: ");
        double imag2 = scanner.nextDouble();

        MyComplex complex1 = new MyComplex(real1, imag1);
        MyComplex complex2 = new MyComplex(real2, imag2);

        // Perform operations and display the results
        System.out.println("Complex 1: " + complex1);
        System.out.println("Complex 2: " + complex2);
        System.out.println();

        complex1.add(complex2);
        System.out.println("Result of addition: " + complex1);
        System.out.println();

        complex1.subtract(complex2);
        System.out.println("Result of subtraction: " + complex1);
        System.out.println();

        MyComplex complex3 = complex1.subtractNew(complex2);
        System.out.println("Result of new subtraction: " + complex3);
        System.out.println();

        complex1.multiply(complex2);
        System.out.println("Result of multiplication: " + complex1);
        System.out.println();

        complex1.divide(complex2);
        System.out.println("Result of division: " + complex1);
        System.out.println();

        complex1.conjugate();
        System.out.println("Complex conjugate: " + complex1);
        System.out.println();

        // Additional operations
        double magnitude = complex1.magnitude();
        double argument = complex1.argument();
        System.out.println("Magnitude of complex1: " + magnitude);
        System.out.println();
        System.out.println("Argument of complex1: " + argument);

        scanner.close();
    }
}
