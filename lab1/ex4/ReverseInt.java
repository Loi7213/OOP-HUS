package lab1.ex4;

import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int inNumber = sc.nextInt();
        int inDigit;

        while (inNumber > 0) {
            inDigit = inNumber % 10;
            System.out.print(inDigit);
            inNumber /= 10;
        }
    }
}