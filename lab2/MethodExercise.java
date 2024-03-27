package lab2update;

import java.util.Scanner;
import java.util.Arrays;

public class MethodExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("The Exponent part!");
        testExponent();

        System.out.println();

        System.out.println("The MagicSum part!");
        testMagicSum(sc);

        System.out.println();

        System.out.println("The Print part!");
        testPrint();

        System.out.println();

        System.out.println("The ArrayToString part!");
        testArrayToString();

        System.out.println();

        System.out.println("The Contains part!");
        testContains();

        System.out.println();

        System.out.println("The Search part!");
        testSearch();

        System.out.println();

        System.out.println("The Equals part!");
        testEquals();

        System.out.println();

        System.out.println("The CopyOf part!");
        testCopyOf();

        System.out.println();

        System.out.println("The Swap part!");
        testSwap();

        System.out.println();

        System.out.println("The Reverse part!");
        testReverse();

        System.out.println();
    }
    public static int exponent(int base, int exp) {
        return (int) Math.pow(base, exp);
    }

    public static void testExponent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the exponent: ");
        int exponent = Integer.parseInt(sc.nextLine());
        System.out.println(base + " raises to the power of "
                + exponent + " is: " + exponent(base, exponent));
    }

    public static boolean hasEight(int number) {
        String numberStr = String.valueOf(number);
        return numberStr.contains("8");
    }

    public static int testMagicSum(Scanner sc) {
        final int SENTINEL = -1;
        System.out.print("Enter a positive integer (or -1 to end): ");
        int number = Integer.parseInt(sc.nextLine());
        int sum = 0;
        while (number != SENTINEL) {
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = Integer.parseInt(sc.nextLine());
            if (hasEight(number)) {
                sum += number;
            }
        }
        System.out.println("The magic sum is: " + sum);
        return SENTINEL;
    }

    public static void printInt(int[] array) {
        if (array == null) {
            return;
        }
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print(array[i]);
            } else {
                System.out.print(", " + array[i]);
            }
        }
        System.out.print("]");
        System.out.println();
    }

    public static void printDouble(double[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print(array[i]);
            } else {
                System.out.print(", " + array[i]);
            }
        }
        System.out.print("]");
        System.out.println();
    }

    public static void printFloat(float[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print(array[i]);
            } else {
                System.out.print(", " + array[i]);
            }
        }
        System.out.print("]");
        System.out.println();
    }

    public static void testPrint() {
        Scanner sc = new Scanner(System.in);

        // Print int array
        System.out.print("Enter the size1 of the int array: ");
        int size1 = sc.nextInt();

        int[] intArray = new int[size1];

        System.out.print("Enter the elements of the int array: ");
        for (int i = 0; i < size1; i++) {
            intArray[i] = sc.nextInt();
        }

        printInt(intArray);

        // Print double array
        System.out.print("Enter the size2 of the double array: ");
        int size2 = sc.nextInt();

        double[] doubleArray = new double[size2];

        System.out.print("Enter the elements of the double array: ");
        for (int i = 0; i < size2; i++) {
            doubleArray[i] = sc.nextDouble();
        }

        printDouble(doubleArray);

        // Print float array
        System.out.print("Enter the size3 of the float array: ");
        int size3 = sc.nextInt();

        float[] floatArray = new float[size3];

        System.out.print("Enter the elements of the float array: ");
        for (int i = 0; i < size3; i++) {
            floatArray[i] = sc.nextFloat();
        }

        printFloat(floatArray);
    }

    public static String arrayToString(int[] array) {
        if (array == null) {
            return null;
        }
        StringBuilder inStr = new StringBuilder("{");
        for (int i = 0; i < array.length - 1; i++) {
            inStr.append(array[i]).append(", ");
        }
        inStr.append(array[array.length - 1]).append("}");
        return inStr.toString();
    }

    public static void testArrayToString() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the intArray: ");
        int size = sc.nextInt();
        int[] intArray = new int[size];
        System.out.print("Enter the elements of the intArray: ");
        for (int i = 0; i < size; i++) {
            intArray[i] = sc.nextInt();
        }
        System.out.print("Array: " + arrayToString(intArray));
        arrayToString(intArray);
        System.out.println();
    }

    public static boolean contains(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static void testContains() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the intArray: ");
        int size = sc.nextInt();
        int[] intArray = new int[size];
        System.out.print("Enter the elements of the intArray: ");
        for (int i = 0; i < size; i++) {
            intArray[i] = sc.nextInt();
        }
        System.out.print("Enter the key: ");
        int key = sc.nextInt();

        boolean result = contains(intArray, key);
        System.out.println("Result: " + result);
    }

    public static int search(int[] array, int key) {
        if (array == null) {
            return 0;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void testSearch() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the intArray: ");
        int size = sc.nextInt();
        int[] intArray = new int[size];
        System.out.print("Enter the elements of the intArray: ");
        for (int i = 0; i < size; i++) {
            intArray[i] = sc.nextInt();
        }
        System.out.print("Enter the key: ");
        int key = sc.nextInt();

        int result = search(intArray, key);
        System.out.println("Result: " + result);
    }
    public static boolean equals(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        } else {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void testEquals() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the arrays: ");
        int size = sc.nextInt();

        int[] intArray1 = new int[size];
        int[] intArray2 = new int[size];

        System.out.print("Enter elements of the first intArray: ");
        for (int i = 0; i < size; i++) {
            intArray1[i] = sc.nextInt();
        }

        System.out.print("Enter elements of the second intArray: ");
        for (int i = 0; i < size; i++) {
            intArray2[i] = sc.nextInt();
        }

        boolean result = equals(intArray1, intArray2);
        System.out.println("Result: " + result);
    }

    public static int[] copyOf(int[] array) {
        int[] copy = new int[array.length];
        System.arraycopy(array, 0, copy, 0, array.length);
        return copy;
    }

    public static int[] copyOf(int[] array, int newLength) {
        int[] copy = new int[newLength];
        int length = Math.min(array.length, newLength);
        System.arraycopy(array, 0, copy, 0, length);
        return copy;
    }

    public static void testCopyOf() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the intArray: ");
        int size = sc.nextInt();

        int[] intArray = new int[size];

        System.out.println("Enter elements of the intArray: ");
        for (int i = 0; i < size; i++) {
            intArray[i] = sc.nextInt();
        }

        // Testing copyOf() without specifying new length
        int[] copy1 = copyOf(intArray);
        System.out.println("Copy1: " + Arrays.toString(copy1));

        // Testing copyOf() with specified new length
        System.out.println("Enter the new length: ");
        int newLength = sc.nextInt();
        int[] copy2 = copyOf(intArray, newLength);
        System.out.println("Copy2: " + Arrays.toString(copy2));
    }

    public static boolean swap(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }

        return true;
    }

    public static void testSwap() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the arrays: ");
        int size = sc.nextInt();

        int[] intArray1 = new int[size];
        int[] intArray2 = new int[size];

        System.out.println("Enter elements of the first intArray: ");
        for (int i = 0; i < size; i++) {
            intArray1[i] = sc.nextInt();
        }

        System.out.println("Enter elements of the second intArray: ");
        for (int i = 0; i < size; i++) {
            intArray2[i] = sc.nextInt();
        }

        boolean result = swap(intArray1, intArray2);
        System.out.println("Swap Result: " + result);
        System.out.println("Array1: " + Arrays.toString(intArray1));
        System.out.println("Array2: " + Arrays.toString(intArray2));
    }

    public static void reverse(int[] array) {
        for (int fIdx = 0, bIdx = array.length - 1; fIdx < bIdx; fIdx++, bIdx--) {
            int temp = array[fIdx];
            array[fIdx] = array[bIdx];
            array[bIdx] = temp;
        }
    }

    public static void testReverse() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the intArray: ");
        int size = sc.nextInt();

        int[] intArray = new int[size];

        System.out.println("Enter elements of the intArray: ");
        for (int i = 0; i < size; i++) {
            intArray[i] = sc.nextInt();
        }

        reverse(intArray);
        System.out.println("Reversed Array: " + Arrays.toString(intArray));
    }
}
