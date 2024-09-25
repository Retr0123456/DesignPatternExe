package StrategyWithGenerics.impl;

import StrategyWithGenerics.CalculateStrategy;

public class DoubleMulStrategy implements CalculateStrategy<Double,Double> {
    @Override
    public Double calculate(Double value1, Double value2) {
        return value1 * value2;
    }
}
