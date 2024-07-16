package hw2.ex1;

import java.util.Scanner;

public class DecisionAndLoopsHomework {
    public static void main(String[] args) {
        System.out.println("The Number Guess program!");
        guessNumber();

        System.out.println();

        System.out.println("The Word Guess program!");
        guessWord();
        System.out.println("Congratulations!");
    }

    public static void guessNumber() {
        int secretNumber = (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        guessNumber(secretNumber, sc);
    }

    public static void guessNumber(int secretNumber, Scanner sc) {
        int trials = 0;
        int guess;
        do {
            System.out.print("Key in your guess: ");
            guess = sc.nextInt();
            trials++;

            if (guess < secretNumber) {
                System.out.println("Try higher");
            } else if (guess > secretNumber) {
                System.out.println("Try lower");
            } else {
                System.out.println("You got it in " + trials + " trials!");
            }
        } while (guess != secretNumber);
    }

    public static void guessWord() {
        Scanner sc = new Scanner(System.in);
        String wordToGuess = "Hello";
        guessWord(wordToGuess, sc);
    }

    public static void guessWord(String wordToGuess, Scanner sc) {
        int trials = 0;
        char[] guessedChars = new char[wordToGuess.length()];
        for (int i = 0; i < guessedChars.length; i++) {
            guessedChars[i] = '_';
        }

        do {
            System.out.print("Key in one character or your guess word: ");
            String input = sc.nextLine();
            trials++;

            if (String.valueOf(guessedChars).equals(wordToGuess)) {
                System.out.println("You got it in " + trials + " trials!");
                return;
            }

            char guessedChar = input.charAt(0);
            boolean found = false;
            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == guessedChar) {
                    guessedChars[i] = guessedChar;
                    found = true;
                }
            }

            System.out.print("Trial " + trials + ": ");
            for (char c : guessedChars) {
                System.out.print(c + " ");
            }
            System.out.println();

        } while (!String.valueOf(guessedChars).equals(wordToGuess));
    }
}