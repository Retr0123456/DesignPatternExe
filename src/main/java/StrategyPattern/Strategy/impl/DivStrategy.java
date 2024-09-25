package StrategyPattern.Strategy.impl;

import StrategyPattern.Strategy.CalculateStrategy;

public class DivStrategy implements CalculateStrategy {
    @Override
    public double calculate(double value1, double value2) {
        if (value2 == 0) {
            throw new RuntimeException("0不能作为被除数！");
        }
        return value1 / value2;
    }
}
