package lab2update;

import java.util.Scanner;

public class StringAndCharacterExercise {
    public static void main(String[] args) {
        System.out.println("The ReverseString part!");
        testReverseString();

        System.out.println();

        System.out.println("The CountVowelsDigits part!");
        testCountVowelsDigits();

        System.out.println();

        System.out.println("The PhoneKeyPad part!");
        testPhoneKeyPad();

        System.out.println();

        System.out.println("The CipherCeasarCode part!");
        testCipherCaesarCode();

        System.out.println();

        System.out.println("The DecipherCeasarCode part!");
        testDecipherCaesarCode();

        System.out.println();

        System.out.println("The HexString part!");
        testHexString();

        System.out.println();

        System.out.println("The BinaryToDecimal part!");
        testBinaryToDecimal();

        System.out.println();

        System.out.println("The HexadecimalToDecimal part!");
        testHexadecimalToDecimal();

        System.out.println();

        System.out.println("The OctalToDecimal part!");
        testOctalToDecimal();

        System.out.println();

        System.out.println("The RadixNToDecimal part!");
        testRadixNToDecimal();
    }

    public static String reverseString(String inStr) {
        int inStrLen = inStr.length();

        StringBuilder reverse = new StringBuilder();
        for (int charIdx = inStrLen - 1; charIdx >= 0; charIdx--) {
            reverse.append(inStr.charAt(charIdx));
        }
        return reverse.toString();
    }

    public static void testReverseString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = sc.next();
        String reverse = reverseString(input);
        System.out.println("The reverse of the String \"" + input + "\" is \"" + reverse + "\".");
    }

    public static int countVowels(String inStr) {
        int vowelCount = 0;
        for (int i = 0; i < inStr.length(); i++) {
            char c = Character.toLowerCase(inStr.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    public static int countDigits(String inStr) {
        int digitCount = 0;
        for (int i = 0; i < inStr.length(); i++) {
            char c = inStr.charAt(i);
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        return digitCount;
    }

    public static void testCountVowelsDigits() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = sc.nextLine();

        int vowelCount = countVowels(inStr);
        int digitCount = countDigits(inStr);
        int totalChars = inStr.length();

        double vowelPercentage = (double) vowelCount / totalChars * 100;
        double digitPercentage = (double) digitCount / totalChars * 100;

        System.out.println("Number of vowels: " + vowelCount
                + " (" + String.format("%.2f", vowelPercentage) + "%)");
        System.out.println("Number of digits: " + digitCount
                + " (" + String.format("%.2f", digitPercentage) + "%)");
    }

    public static String phoneKeyPad(String inStr) {
        StringBuilder converted = new StringBuilder();
        inStr = inStr.toUpperCase();
        for (int i = 0; i < inStr.length(); i++) {
            char c = inStr.charAt(i);
            if (Character.isLetter(c)) {
                if (c >= 'A' && c <= 'C') {
                    converted.append('2');
                } else if (c >= 'D' && c <= 'F') {
                    converted.append('3');
                } else if (c >= 'G' && c <= 'I') {
                    converted.append('4');
                } else if (c >= 'J' && c <= 'L') {
                    converted.append('5');
                } else if (c >= 'M' && c <= 'O') {
                    converted.append('6');
                } else if (c >= 'P' && c <= 'S') {
                    converted.append('7');
                } else if (c >= 'T' && c <= 'V') {
                    converted.append('8');
                } else if (c >= 'W' && c <= 'Z') {
                    converted.append('9');
                }
            } else {
                converted.append(c);
            }
        }
        return converted.toString();
    }

    public static String phoneKeyPadNestedIf(String inStr) {
        StringBuilder converted = new StringBuilder();
        inStr = inStr.toUpperCase();
        for (int i = 0; i < inStr.length(); i++) {
            char c = inStr.charAt(i);
            if (Character.isLetter(c)) {
                if (c >= 'A' && c <= 'C') {
                    converted.append('2');
                } else if (c >= 'D' && c <= 'F') {
                    converted.append('3');
                } else if (c >= 'G' && c <= 'I') {
                    converted.append('4');
                } else if (c >= 'J' && c <= 'L') {
                    converted.append('5');
                } else if (c >= 'M' && c <= 'O') {
                    converted.append('6');
                } else if (c >= 'P' && c <= 'S') {
                    converted.append('7');
                } else if (c >= 'T' && c <= 'V') {
                    converted.append('8');
                } else if (c >= 'W' && c <= 'Z') {
                    converted.append('9');
                }
            } else {
                converted.append(c);
            }
        }
        return converted.toString();
    }

    public static String phoneKeyPadSwitchCase(String inStr) {
        StringBuilder converted = new StringBuilder();
        inStr = inStr.toUpperCase();
        for (int i = 0; i < inStr.length(); i++) {
            char c = inStr.charAt(i);
            if (Character.isLetter(c)) {
                switch (c) {
                    case 'A':
                    case 'B':
                    case 'C':
                        converted.append('2');
                        break;
                    case 'D':
                    case 'E':
                    case 'F':
                        converted.append('3');
                        break;
                    case 'G':
                    case 'H':
                    case 'I':
                        converted.append('4');
                        break;
                    case 'J':
                    case 'K':
                    case 'L':
                        converted.append('5');
                        break;
                    case 'M':
                    case 'N':
                    case 'O':
                        converted.append('6');
                        break;
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                        converted.append('7');
                        break;
                    case 'T':
                    case 'U':
                    case 'V':
                        converted.append('8');
                        break;
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                        converted.append('9');
                        break;
                }
            } else {
                converted.append(c);
            }
        }
        return converted.toString();
    }

    public static void testPhoneKeyPad() {
        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String inStr = sc.next();

        System.out.println(phoneKeyPad(inStr));
        System.out.println("Using nested-if: " + phoneKeyPadNestedIf(inStr));
        System.out.println("Using switch-case-default: " + phoneKeyPadSwitchCase(inStr));
    }

    public static String cipherCaesarCode(String inStr) {
        StringBuilder ciphertext = new StringBuilder();
        int shift = 3;

        for (int i = 0; i < inStr.length(); i++) {
            char c = inStr.charAt(i);
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                int offset = (c - base + shift) % 26;
                char shiftedChar = (char) (base + offset);
                ciphertext.append(shiftedChar);
            } else {
                ciphertext.append(c);
            }
        }

        return ciphertext.toString();
    }

    public static void testCipherCaesarCode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a plaintext string consisting of mix-case letters only: ");
        String plaintext = sc.nextLine();

        String ciphertext = cipherCaesarCode(plaintext.toUpperCase());

        System.out.println("The ciphertext string is: " + ciphertext);
    }

    public static String decipherCaesarCode(String inStr) {
        StringBuilder plaintext = new StringBuilder();
        int shift = 3;

        for (int i = 0; i < inStr.length(); i++) {
            char c = inStr.charAt(i);
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                int offset = (c - base - shift + 26) % 26;
                char shiftedChar = (char) (base + offset);
                plaintext.append(shiftedChar);
            } else {
                plaintext.append(c);
            }
        }

        return plaintext.toString();
    }

    public static void testDecipherCaesarCode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ciphertext string: ");
        String ciphertext = sc.nextLine();

        String plaintext = decipherCaesarCode(ciphertext.toUpperCase());

        System.out.println("The plaintext string is: " + plaintext);
    }

    public static boolean isHexString(String hexStr) {
        if (hexStr.isEmpty()) {
            return false;
        }

        for (char c : hexStr.toCharArray()) {
            if (!Character.isDigit(c) && !(c >= 'A' && c <= 'F')
                    && !(c >= 'a' && c <= 'f')) {
                return false;
            }
        }
        return true;
    }

    public static void testHexString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        String hexStr = sc.nextLine();

        boolean isValidHex = isHexString(hexStr);

        if (isValidHex) {
            System.out.println(hexStr + " is a hex string!");
        } else {
            System.out.println(hexStr + " is NOT a valid hex string!");
        }
    }

    public static int binaryToDecimal(String binStr) {
        int decimal = 0;
        int power = 0;

        for (int i = binStr.length() - 1; i >= 0; i--) {
            char c = binStr.charAt(i);

            if (c == '0' || c == '1') {
                int digit = c - '0';

                decimal += digit * Math.pow(2, power);

                power++;
            } else {
                throw new IllegalArgumentException("error: invalid binary string: " + binStr);
            }
        }

        return decimal;
    }

    public static void testBinaryToDecimal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        String binStr = sc.nextLine();

        try {
            int decimal = binaryToDecimal(binStr);
            System.out.println("The equivalent decimal number for binary \"" + binStr + "\" is: " + decimal);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int hexadecimalToDecimal(String hexStr) {
        int decimal = 0;

        for (int i = hexStr.length() - 1; i >= 0; i--) {
            char c = hexStr.charAt(i);

            if (Character.isDigit(c) || (c >= 'A' && c <= 'F') || (c >= 'a' && c <= 'f')) {
                int digit = Character.digit(c, 16);

                decimal += digit * Math.pow(16, hexStr.length() - 1 - i);
            } else {
                throw new IllegalArgumentException("error: invalid hexadecimal string: " + hexStr);
            }
        }
        return decimal;
    }

    public static void testHexadecimalToDecimal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hexadecimal string: ");
        String hexStr = sc.nextLine();

        try {
            int decimal = hexadecimalToDecimal(hexStr);
            System.out.println("The equivalent decimal number is: " + decimal);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int octalToDecimal(String octalStr) {
        int decimal = 0;

        for (int i = octalStr.length() - 1; i >= 0; i--) {
            char c = octalStr.charAt(i);

            if (c >= '0' && c <= '7') {
                int digit = c - '0';
                decimal += digit * Math.pow(8, octalStr.length() - 1 - i);
            } else {
                throw new IllegalArgumentException("Invalid octal string: " + octalStr);
            }
        }

        return decimal;
    }

    public static void testOctalToDecimal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Octal string: ");
        String octalStr = sc.nextLine();

        try {
            int decimal = octalToDecimal(octalStr);
            System.out.println("The equivalent decimal number \"" + octalStr + "\" is: " + decimal);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int radixNToDecimal(String radixNStr, int radix) {
        int decimal = 0;

        for (int i = 0; i < radixNStr.length(); i++) {
            char c = radixNStr.charAt(i);

            if (Character.digit(c, radix) != -1) {
                int digit = Character.digit(c, radix);

                decimal = (decimal * radix) + digit;
            } else {
                throw new IllegalArgumentException("Invalid radix n string: " + radixNStr);
            }
        }

        return decimal;
    }

    public static void testRadixNToDecimal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radix: ");
        int radix = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the string: ");
        String radixNStr = sc.nextLine();

        try {
            int decimal = radixNToDecimal(radixNStr, radix);
            System.out.println("The equivalent decimal number \"" + radixNStr + "\" is: " + decimal);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
