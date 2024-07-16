package lab10.strategy.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SortingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Choose a sorting algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        int choice = scanner.nextInt();

        SortStrategy strategy;
        switch (choice) {
            case 1:
                strategy = new BubbleSort();
                break;
            case 2:
                strategy = new SelectionSort();
                break;
            case 3:
                strategy = new InsertionSort();
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        strategy.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
