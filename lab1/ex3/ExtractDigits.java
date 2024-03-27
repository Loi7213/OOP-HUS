package lab1.ex3;

import java.util.Scanner;

public class ExtractDigits {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n > 0) {
            int digit = n % 10;
            System.out.print(digit + " ");
            n = n / 10;
        }
    }
}
