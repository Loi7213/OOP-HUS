package hw2.ex2;

import java.util.Scanner;

public class NestedLoopsExercise {
    public static void main(String[] args) {
        System.out.println("The SquarePattern program!");
        testSquarePattern();

        System.out.println();

        System.out.println("The SquarePatternWhile program!");
        testSquarePatternWhile();

        System.out.println();

        System.out.println("The CheckerPattern program!");
        testCheckerPattern();

        System.out.println();

        System.out.println("The TimeTable program!");
        testTimeTable();

        System.out.println();

        System.out.println("The TriangularPattern program!");
        testTriangularPattern();

        System.out.println();

        System.out.println("The BoxPattern program!");
        testBoxPattern();

        System.out.println();

        System.out.println("The HillPattern program!");
        testHillPattern();
    }

    public static void squarePattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void testSquarePattern() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        squarePattern(size);
    }

    public static void squarePatternWhile(int n) {
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < n) {
                System.out.print("# ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void testSquarePatternWhile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        squarePatternWhile(size);
    }

    public static void checkerPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("# ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void testCheckerPattern() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        checkerPattern(size);
    }

    public static void timeTable(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }

    public static void testTimeTable() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        timeTable(size);
    }

    public static void triangularPatternA(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void triangularPatternB(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row + col <= n + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void triangularPatternC(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row <= col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void triangularPatternD(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row + col >= n + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void testTriangularPattern() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        triangularPatternA(size);
        System.out.println();
        triangularPatternB(size);
        System.out.println();
        triangularPatternC(size);
        System.out.println();
        triangularPatternD(size);
    }

    public static void boxPatternA(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || col == 1 || col == n) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void boxPatternB(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || row == col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void boxPatternC(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || row == n - col + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void boxPatternD(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || row == n - col + 1 || row == col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void testBoxPattern() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        boxPatternA(size);
        System.out.println();
        boxPatternB(size);
        System.out.println();
        boxPatternC(size);
        System.out.println();
        boxPatternD(size);
    }

    public static void hillPatternA(int n) {
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= 2 * n - row; col++) {
                if (col >= row) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void hillPatternB(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= 2 * n - row; col++) {
                if (col >= row) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void hillPatternC(int n) {
        int numRows = n * 2 - 1;
        int numSpaces = n - 1;
        int numSymbols = 1;

        for (int row = 1; row <= numRows; row++) {
            for (int space = 1; space <= numSpaces; space++) {
                System.out.print("  ");
            }
            for (int symbol = 1; symbol <= numSymbols; symbol++) {
                System.out.print("# ");
            }
            System.out.println();

            if (row < n) {
                numSpaces--;
                numSymbols += 2;
            } else {
                numSpaces++;
                numSymbols -= 2;
            }
        }
    }

    public static void hillPatternD(int n) {
        int numRows = n * 2 - 1;
        int numSymbols = numRows;
        int numHashes = 0;

        for (int row = 1; row <= numRows; row++) {
            for (int symbol = 1; symbol <= numSymbols; symbol++) {
                System.out.print("# ");
            }
            for (int hash = 1; hash <= numHashes; hash++) {
                System.out.print("  ");
            }
            for (int symbol = 1; symbol <= numSymbols; symbol++) {
                System.out.print("# ");
            }
            System.out.println();

            if (row < n) {
                numSymbols--;
                numHashes += 2;
            } else {
                numSymbols++;
                numHashes -= 2;
            }
        }
    }

    public static void testHillPattern() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        hillPatternA(size);
        System.out.println();
        hillPatternB(size);
        System.out.println();
        hillPatternC(size);
        System.out.println();
        hillPatternD(size);
    }
}