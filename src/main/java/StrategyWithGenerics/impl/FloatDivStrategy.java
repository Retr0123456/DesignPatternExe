package StrategyWithGenerics.impl;

import StrategyWithGenerics.CalculateStrategy;

public class FloatDivStrategy implements CalculateStrategy<Float,Double> {
    @Override
    public Double calculate(Float value1, Float value2) {
        if (value2 == 0f) {
            throw new RuntimeException("0不能作为被除数!");
        }
        return (double) (value1 / value2);
    }
}
