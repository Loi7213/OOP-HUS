package lab1.ex4;

import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main(String[] args) {
        int sum;
        int product;
        int min;
        int max;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st integer: ");
        int number1 = sc.nextInt();

        System.out.print("Enter 2nd integer: ");
        int number2 = sc.nextInt();

        System.out.print("Enter 3rd integer: ");
        int number3 = sc.nextInt();

        sc.close();

        sum = number1 + number2 + number3;
        product = number1 * number2 * number3;

        min = number1;
        if (number2 < min) {
            min = number2;
        }
        if (number3 < min) {
            min = number3;
        }

        max = number1;
        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }

        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("The min is: " + min);
        System.out.println("The max is: " + max);
    }
}
