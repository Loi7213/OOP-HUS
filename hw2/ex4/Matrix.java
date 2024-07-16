package hw2.ex4;

public class Matrix {

    public static void print(int[][] matrix) {
        if (matrix == null)
            return;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%4d ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void print(double[][] matrix) {
        if (matrix == null)
            return;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%5.2f ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        if (matrix1 == null || matrix2 == null) {
            return true;
        }
        if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) {
            return true;
        }
        return false;
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        if (matrix1 == null || matrix2 == null) {
            return true;
        }
        if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) {
            return true;
        }
        return false;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1[0].length];
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        double[][] result = new double[matrix1.length][matrix1[0].length];
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1[0].length];
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        double[][] result = new double[matrix1.length][matrix1[0].length];
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        double[][] result = new double[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] a = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] b = new int[][] { { 2, 7 }, { 5, 13 }, { 12, 17 } };
        double[][] c = new double[][] { { 1.9, 0.6, 0.1 }, { 2.6, 0.9, 0.1 } };
        double[][] d = new double[][] { { 9, 2.1 }, { 1.01, 9.9 }, { 0.5, 1 }, { 1.18, 2 } };
        System.out.println("Matrix A is: ");
        print(a);
        System.out.println();
        System.out.println("Matrix B is: ");
        print(b);
        System.out.println();
        System.out.println("Matrix C is: ");
        print(c);
        System.out.println();
        System.out.println("Matrix D is: ");
        print(d);
        System.out.println();
        System.out.println("Matrix A add A is: ");
        print(add(a, a));
        System.out.println("Matrix A multiply B is: ");
        print(multiply(a, b));
    }

}