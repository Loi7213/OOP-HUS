package lab5.polynomial;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int degree = getDegree();

        for (int i = degree; i >= 0; i--) {
            sb.append(coeffs[i]);
            if (i > 0) {
                sb.append("x^").append(i).append(" + ");
            }
        }

        return sb.toString();
    }

    public double evaluate(double x) {
        double result = 0;
        int degree = getDegree();

        for (int i = degree; i >= 0; i--) {
            result += coeffs[i] * Math.pow(x, i);
        }

        return result;
    }

    public MyPolynomial add(MyPolynomial another) {
        int degree1 = getDegree();
        int degree2 = another.getDegree();
        int maxDegree = Math.max(degree1, degree2);

        double[] resultCoeffs = new double[maxDegree + 1];

        for (int i = 0; i <= maxDegree; i++) {
            double coeff1 = (i <= degree1) ? coeffs[i] : 0;
            double coeff2 = (i <= degree2) ? another.coeffs[i] : 0;
            resultCoeffs[i] = coeff1 + coeff2;
        }

        return new MyPolynomial(resultCoeffs);
    }

    public MyPolynomial multiply(MyPolynomial another) {
        int degree1 = getDegree();
        int degree2 = another.getDegree();
        int resultDegree = degree1 + degree2;

        double[] resultCoeffs = new double[resultDegree + 1];

        for (int i = 0; i <= degree1; i++) {
            for (int j = 0; j <= degree2; j++) {
                resultCoeffs[i + j] += coeffs[i] * another.coeffs[j];
            }
        }

        return new MyPolynomial(resultCoeffs);
    }
}
