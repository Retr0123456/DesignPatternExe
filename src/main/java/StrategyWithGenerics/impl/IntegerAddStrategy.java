package StrategyWithGenerics.impl;

import StrategyWithGenerics.CalculateStrategy;

public class IntegerAddStrategy implements CalculateStrategy<Integer,Double> {
    @Override
    public Double calculate(Integer value1, Integer value2) {
        return (double) (value1 + value2);
    }
}
