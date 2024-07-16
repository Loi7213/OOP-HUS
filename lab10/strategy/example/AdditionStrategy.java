package lab10.strategy.example;

public class AdditionStrategy implements CalculationStrategy {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
