package lab3.ex3;

import java.util.Scanner;

public class GCD {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a: ");
        int a = sc.nextInt();
        System.out.print("Enter the number b: ");
        int b = sc.nextInt();
        System.out.println("GCD(" + a + ", " + b + ") = " + gcd(a, b));
    }
}
