package lab1.ex3;

public class HarmonicSum {
    public static void main(String[] args) {
        final int MAX_DENOMINATOR = 50000;
        double sumL2R = 0.0;
        double sumR2L = 0.0;
        double absDiff;
        double temp = 0.0;

        // for-loop for summing from left-to-right
        for (int denominator = 1; denominator <= MAX_DENOMINATOR; ++denominator) {
            temp = (double) 1 / denominator;
            sumL2R += temp;
        }
        System.out.println("The sum from left-to-right is: " + sumL2R);

        // for-loop for summing from right-to-left
        for (int denominator = MAX_DENOMINATOR; denominator >= 1; --denominator) {
            temp = (double) 1 / denominator;
            sumR2L += temp;
        }
        System.out.println("The sum from left-to-right is: " + sumR2L);

        // Find the absolute difference and display
        if (sumL2R > sumR2L) {
            absDiff = sumL2R - sumR2L;
        } else {
            absDiff = sumR2L - sumL2R;
        }
        System.out.println("The absolute difference between two sums is: " + absDiff);
    }
}
