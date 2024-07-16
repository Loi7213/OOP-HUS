package lab10.strategy.example;

public class Calculator {
    private CalculationStrategy strategy;

    public void setStrategy(CalculationStrategy strategy) {
        this.strategy = strategy;
    }

    public int performCalculation(int a, int b) {
        return strategy.calculate(a, b);
    }
}
