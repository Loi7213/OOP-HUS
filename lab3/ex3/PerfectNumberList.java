package lab3.ex3;

import java.util.Scanner;

public class PerfectNumberList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int upperBound = Integer.parseInt(sc.nextLine());
        if (upperBound < 0) {
            System.out.println("Upper bound is not positive. Please try again!");
        }

        int[] perfectNumberList = new int[0];
        int[] deficientNorPerfectNumberList = new int[0];
        for (int i = 1; i <= upperBound; i++) {
            if (isPerfect(i)) {
                perfectNumberList = print(perfectNumberList, perfectNumberList.length + 1);
                perfectNumberList[perfectNumberList.length - 1] = i;
            } else if (!isDeficient(i)) {
                deficientNorPerfectNumberList = print(deficientNorPerfectNumberList,
                        deficientNorPerfectNumberList.length + 1);
                deficientNorPerfectNumberList[deficientNorPerfectNumberList.length - 1] = i;
            }
        }
        double percent;
        System.out.println("These number are perfect: ");
        for (int i = 0; i < perfectNumberList.length; i++)
            System.out.print(perfectNumberList[i] + " ");
        percent = (double) perfectNumberList.length / upperBound * 100;
        System.out.printf("\n[%d perfect numbers found (%2.2f%%)]\n", perfectNumberList.length, percent);

        System.out.println("These number are neither deficient or perfect: ");
        for (int i = 0; i < deficientNorPerfectNumberList.length; i++)
            System.out.print(deficientNorPerfectNumberList[i] + " ");
        percent = (double) deficientNorPerfectNumberList.length / upperBound * 100;
        System.out.printf("\n[%d perfect numbers found (%2.2f%%)]\n", deficientNorPerfectNumberList.length, percent);
    }

    public static boolean isPerfect(int aPosInt) {
        int sum = 0;
        if (aPosInt <= 0) {
            return false;
        }
        for (int k = 1; k < aPosInt; k++) {
            if (aPosInt % k == 0) {
                sum += k;
            }
        }
        if (sum == aPosInt) {
            return true;
        }
        return false;
    }

    public static boolean isDeficient(int aPosInt) {
        int sum = 0;
        if (aPosInt <= 0) {
            return false;
        }
        for (int k = 1; k < aPosInt; k++) {
            if (aPosInt % k == 0) {
                sum += k;
            }
        }
        if (sum < aPosInt) {
            return true;
        }
        return false;
    }

    public static int[] print(int[] array, int newLength) {
        int[] printedArray = new int[newLength];
        for (int i = 0; i < array.length; i++) {
            printedArray[i] = array[i];
        }
        for (int i = array.length; i < newLength; i++) {
            printedArray[i] = 0;
        }
        return printedArray;
    }
}
