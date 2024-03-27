package lab1.ex3;

public class SumAverageRunningInt {
    public static void usingForLoop(int LOWERBOUND, int UPPERBOUND) {
        int sum = 0;

        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            sum += number;
        }

        double average = (double) sum / ((UPPERBOUND - LOWERBOUND) + 1);

        System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
        System.out.println("The average is " + average);

    }

    public static void usingWhileDoLoop(int LOWERBOUND, int UPPERBOUND) {
        int sum = 0;
        int number = LOWERBOUND;

        while (number <= UPPERBOUND) {
            sum += number;
            ++number;
        }

        double average = (double) sum / ((UPPERBOUND - LOWERBOUND) + 1);

        System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
        System.out.println("The average is " + average);
    }

    public static void usingDoWhileLoop(int LOWERBOUND, int UPPERBOUND) {
        int sum = 0;
        int number = LOWERBOUND;

        do {
            sum += number;
            ++number;
        } while (number <= UPPERBOUND);

        double average = (double) sum / ((UPPERBOUND - LOWERBOUND) + 1);

        System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
        System.out.println("The average is " + average);
    }

    /* Điểm khác biệt chính giữa vòng lặp "for" và "while-do" nằm ở việc
    xác định số lần lặp:
        - "for": Thường được dùng khi đã biết số lần lặp
        - "while-do": Thường được sử dụng khi chưa biết số lần lặp
     */

    /* Điểm khác biệt chính giữa vòng lặp "while-do" và "do-while"
    nằm ở việc kiểm tra điều kiện:
        - "while-do": Kiểm tra điều kiện trước, thực thi vòng lặp sau
            -> Vòng lặp có thể không được thực thi lần nào
        - "do-while": Thực thi vòng lặp trước, kiểm tra điều kiện sau
            -> Vòng lặp được thực thi ít nhất 1 lần
     */

    public static void introduceCount(int start, int end) {
        int sum = 0;
        int count = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
            ++count;
        }

        double average = (double) sum / count;

        System.out.println("The sum of " + start + " to " + end + " is " + sum);
        System.out.println("The average is " + average);
    }

    public static void sumOfSquares(int LOWERBOUND, int UPPERBOUND) {
        int sum = 0;

        for (int i = LOWERBOUND; i <= UPPERBOUND; i++) {
            sum += i*i;
        }

        System.out.println("Sum of the squares from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
    }

    public static void twoSums(int LOWERBOUND, int UPPERBOUND) {
        int sumOdd = 0;
        int sumEven = 0;
        int absDiff;

        for (int number = LOWERBOUND; number <= UPPERBOUND; number++) {
            if (number % 2 != 0) {
                sumOdd += number;
            } else {
                sumEven += number;
            }
        }

        if (sumOdd > sumEven) {
            absDiff = sumOdd - sumEven;
        } else {
            absDiff = sumEven - sumOdd;
        }

        System.out.println("The absolute difference of sumOdd("
                + sumOdd + ") and sumEven(" + sumEven + ") is " + absDiff);
    }

    public static void main(String[] args) {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;

        usingForLoop(LOWERBOUND, UPPERBOUND);
        usingWhileDoLoop(LOWERBOUND, UPPERBOUND);
        usingDoWhileLoop(LOWERBOUND, UPPERBOUND);
        sumOfSquares(LOWERBOUND, UPPERBOUND);
        twoSums(LOWERBOUND, UPPERBOUND);

        final int start = 111;
        final int end = 8899;

        introduceCount(start, end);
    }
}
