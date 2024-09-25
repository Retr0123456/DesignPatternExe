package Strategy.StrategyPattern.Strategy.impl;

import Strategy.StrategyPattern.Strategy.CalculateStrategy;

public class SubStrategy implements CalculateStrategy {
    @Override
    public double calculate(double value1, double value2) {
        return value1 - value2;
    }
}
