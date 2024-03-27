package lab1.ex4;

import java.util.Scanner;

public class CylinderComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();
        System.out.print("Enter the height: ");
        double height = sc.nextDouble();

        double pi = Math.PI;

        double baseArea = pi * radius * radius;
        double surfaceArea = 2.0 * pi * radius + 2.0 * baseArea;
        double volume = baseArea * height;

        System.out.printf("Base area is: %.2f%n", baseArea);
        System.out.printf("Surface area is: %.2f%n", surfaceArea);
        System.out.printf("Volume is: %.2f%n", volume);
    }
}
