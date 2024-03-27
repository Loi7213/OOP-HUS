package lab1.ex3;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 3;
        int fn;
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        int nMax = 20;
        int sum = fnMinus1 + fnMinus2;
        double average;

        System.out.println("The first " + nMax + " Fibonacci numbers are: ");
        System.out.print(fnMinus2 + " " + fnMinus1 + " ");

        while (n <= nMax) {
            fn = fnMinus1 + fnMinus2;
            ++n;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
            sum += fn;

            System.out.print(fn + " ");
        }

        System.out.println();

        average = (double) sum / nMax;
        System.out.println("The average is " + average);
    }
}
