package lab2update;

import java.util.Scanner;

public class ArrayExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // PrintArray
        System.out.println("The PrintArray part!");
        int[] arr = createArray(sc);
        System.out.print("The values are: ");
        printArray(arr);

        System.out.println();

        // GradesStatistics
        System.out.println("The GradesStatistics part!");
        int[] grades = generateStudentGrade(sc);
        simpleGradesStatistics(grades);

        System.out.println();

        // HexadecimalToBinary
        System.out.println("The HexadecimalToBinary part!");
        testHexadecimalToBinary(sc);

        System.out.println();

        // DecimalToHexadecimal
        System.out.println("The DecimalToHexadecimal part!");
        testDecimalToHexadecimal(sc);
    }

    // PrintArray
    public static int[] createArray(Scanner sc) {
        System.out.print("Enter the number of items: ");
        int numItems = sc.nextInt();
        int[] items = new int[numItems];

        System.out.print("Enter the values of all items (separated by spaces): ");
        for (int i = 0; i < numItems; i++) {
            items[i] = sc.nextInt();
        }

        return items;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.println("]");
    }

    // GradesStatistics
    public static int[] generateStudentGrade(Scanner sc) {
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        int[] grades = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            grades[i] = sc.nextInt();
        }

        return grades;
    }

    public static void simpleGradesStatistics(int[] grades) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int grade : grades) {
            sum += grade;
            min = Math.min(min, grade);
            max = Math.max(max, grade);
        }

        double average = (double) sum / grades.length;

        System.out.printf("The average is: %.2f%n", average);
        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);
    }

    // HexadecimalToBinary
    public static String hexadecimalToBinary(String hexStr) {
        final String[] HEX_BITS = {"0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"};

        StringBuilder binary = new StringBuilder();

        for (int i = 0; i < hexStr.length(); i++) {
            char c = Character.toUpperCase(hexStr.charAt(i));
            int index = Character.isDigit(c) ? c - '0' : c - 'A' + 10;
            binary.append(HEX_BITS[index]).append(" ");
        }

        return binary.toString();
    }

    public static void testHexadecimalToBinary(Scanner in) {
        System.out.print("Enter a Hexadecimal string: ");
        String hexStr = in.next();
        String binaryStr = hexadecimalToBinary(hexStr);
        System.out.println("The equivalent binary for hexadecimal \"" + hexStr + "\" is: " + binaryStr);
    }

    // DecimalToHexadecimal
    public static String decimalToHexadecimal(int positiveInteger) {
        StringBuilder hexadecimal = new StringBuilder();

        while (positiveInteger > 0) {
            int remainder = positiveInteger % 16;
            char hexDigit = (remainder < 10) ? (char) (remainder + '0') : (char) (remainder - 10 + 'A');
            hexadecimal.insert(0, hexDigit);
            positiveInteger /= 16;
        }

        return hexadecimal.toString();
    }

    public static void testDecimalToHexadecimal(Scanner sc) {
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        String hexadecimal = decimalToHexadecimal(decimal);
        System.out.println("The equivalent hexadecimal number for decimal " + decimal + " is " + hexadecimal);
    }
}
