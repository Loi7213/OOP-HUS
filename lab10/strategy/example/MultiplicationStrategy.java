package lab10.strategy.example;

public class MultiplicationStrategy implements CalculationStrategy {
    @Override
    public int calculate(int a, int b) {
        return a * b;
    }
}