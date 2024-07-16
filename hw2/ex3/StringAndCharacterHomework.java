package hw2.ex3;

import java.util.Scanner;

public class StringAndCharacterHomework {
    public static void main(String[] args) {
        System.out.println("The Exchange Cipher program!");
        testExchangeCipher();

        System.out.println();

        System.out.println("The Palindromic program!");
        testPalindromicWord();
        testPalindromicPhrase();
    }

    public static String exchangeCipher(String inStr) {
        StringBuilder cipherText = new StringBuilder();
        for (int i = 0; i < inStr.length(); i++) {
            char ch = inStr.charAt(i);
            if (Character.isUpperCase(ch)) {
                char cipherCh = (char) ('A' + 'Z' - ch);
                cipherText.append(cipherCh);
            } else {
                cipherText.append(ch);
            }
        }
        return cipherText.toString();
    }

    public static void testExchangeCipher() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String plainText = scanner.next().toUpperCase();
        String cipherText = exchangeCipher(plainText);
        System.out.println("The ciphertext string is: " + cipherText);
    }

    public static boolean isPalindromicWord(String inStr) {
        int left = 0;
        int right = inStr.length() - 1;
        while (left < right) {
            char leftChar = Character.toLowerCase(inStr.charAt(left));
            char rightChar = Character.toLowerCase(inStr.charAt(right));
            if (!Character.isLetter(leftChar)) {
                left++;
            } else if (!Character.isLetter(rightChar)) {
                right--;
            } else if (leftChar != rightChar) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }

    public static void testPalindromicWord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.next();
        boolean isPalindromic = isPalindromicWord(word);
        System.out.println("\"" + word + "\" is " + (isPalindromic ? "" : "not ") + "a palindrome.");
    }

    public static boolean isPalindromicPhrase(String inStr) {
        StringBuilder phraseBuilder = new StringBuilder();
        for (int i = 0; i < inStr.length(); i++) {
            char ch = inStr.charAt(i);
            if (Character.isLetter(ch)) {
                phraseBuilder.append(Character.toLowerCase(ch));
            }
        }
        String phrase = phraseBuilder.toString();
        return isPalindromicWord(phrase);
    }

    public static void testPalindromicPhrase() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String phrase = sc.nextLine();
        boolean isPalindromic = isPalindromicPhrase(phrase);
        System.out.println("\"" + phrase + "\" is " + (isPalindromic ? "" : "not ") + "a palindrome.");
    }
}
