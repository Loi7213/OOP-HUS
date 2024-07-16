package lab10.strategy.example;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Addition
        calculator.setStrategy(new AdditionStrategy());
        int result = calculator.performCalculation(5, 3);
        System.out.println("5 + 3 = " + result);

        // Subtraction
        calculator.setStrategy(new SubtractionStrategy());
        result = calculator.performCalculation(10, 4);
        System.out.println("10 - 4 = " + result);

        // Multiplication
        calculator.setStrategy(new MultiplicationStrategy());
        result = calculator.performCalculation(7, 6);
        System.out.println("7 * 6 = " + result);
    }
}
