package Strategy.StrategyWithGenerics.impl;

import Strategy.StrategyWithGenerics.CalculateStrategy;

public class DoubleMulStrategy implements CalculateStrategy<Double,Double> {
    @Override
    public Double calculate(Double value1, Double value2) {
        return value1 * value2;
    }
}
