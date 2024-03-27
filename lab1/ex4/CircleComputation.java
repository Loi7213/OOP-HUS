package lab1.ex4;

import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();

        double pi = Math.PI;

        double diameter = 2.0 * radius;
        double area = pi * radius * radius;
        double circumference = 2.0 * pi * radius;

        System.out.printf("Diameter is: %.2f%n", diameter);
        System.out.printf("Area is: %.2f%n", area);
        System.out.printf("Circumference is: %.2f%n", circumference);
    }
}
