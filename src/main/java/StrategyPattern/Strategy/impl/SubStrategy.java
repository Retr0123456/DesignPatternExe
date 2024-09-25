package StrategyPattern.Strategy.impl;

import StrategyPattern.Strategy.CalculateStrategy;

public class SubStrategy implements CalculateStrategy {
    @Override
    public double calculate(double value1, double value2) {
        return value1 - value2;
    }
}
