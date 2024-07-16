package lab3.ex2;

import java.util.Scanner;
import java.util.Arrays;

public class ExercisesOnSearchingAlgorithms {
    public static void main(String[] args) {
        System.out.println("Linear Search program!");
        testLinearSearch();

        System.out.println();

        System.out.println("Binary Search program!");
        testBinarySearch();
    }

    public static boolean linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        for (int i = 0; i <= array.length; i++) {
            if (array[i] == key) {
                return i;
            }
            return -1;
        }
        return -1;
    }

    public static void testLinearSearch() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the array: ");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter your key: ");
        int key = sc.nextInt();

        System.out.println("The array: " + Arrays.toString(array));
        System.out.println("The key is searched by Linear Search which is: " + linearSearch(array, key));
        System.out.println("The index of key: " + linearSearchIndex(array, key));
    }

    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
        if (fromIdx >= toIdx) {
            return false;
        } else if (fromIdx == toIdx - 1) {
            return key == array[fromIdx];
        } else {
            int middleIdx = (fromIdx + toIdx) / 2;
            if (key == array[middleIdx]) {
                return true;
            } else if (key < array[middleIdx]) {
                toIdx = middleIdx;
            } else {
                fromIdx = middleIdx + 1;
            }
            return binarySearch(array, key, fromIdx, toIdx);
        }
    }

    public static int binarySearchIndex(int[] array, int key, int fromIdx, int toIdx) {
        if (fromIdx == toIdx - 1) {
            if (key == array[fromIdx]) {
                return fromIdx;
            } else {
                return -1;
            }
        } else {
            int middleIdx = (fromIdx + toIdx) / 2;
            if (key == array[middleIdx]) {
                return middleIdx;
            } else if (key < array[middleIdx]) {
                toIdx = middleIdx;
            } else {
                fromIdx = middleIdx + 1;
            }
            return binarySearchIndex(array, key, fromIdx, toIdx);
        }
    }

    public static void testBinarySearch() {
        Scanner sc = new Scanner(System.in);

        System.out.print("The number of elements of the array: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the array: ");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter your key: ");
        int key = sc.nextInt();

        int fromIdx = 0;
        int toIdx = array.length - 1;
        if (binarySearch(array, key, fromIdx, toIdx)) {
            System.out.println("Index of key from array is: "
                    + binarySearchIndex(array, key, fromIdx, toIdx));
        } else {
            System.out.println("Not Found");
        }
    }
}
