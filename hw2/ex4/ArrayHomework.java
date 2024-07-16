package hw2.ex4;

import java.util.Scanner;

public class ArrayHomework {
    public static void main(String[] args) {
        printArrayStars();
    }

    public static void printArrayStars() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int numItems = scanner.nextInt();

        int[] items = new int[numItems];
        System.out.print("Enter the values of all items (separated by space): ");
        for (int i = 0; i < numItems; i++) {
            items[i] = scanner.nextInt();
        }

        for (int i = 0; i < numItems; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < items[i]; j++) {
                System.out.print("*");
            }
            System.out.print(" (" + items[i] + ")");
            System.out.println();
        }

        scanner.close();
    }
}