package StrategyWithFunctionInterface;

@FunctionalInterface
public interface CalculateStrategy {
    double calculate(int value1, int value2);
}
