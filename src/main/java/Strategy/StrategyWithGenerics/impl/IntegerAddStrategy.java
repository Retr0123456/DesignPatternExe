package Strategy.StrategyWithGenerics.impl;

import Strategy.StrategyWithGenerics.CalculateStrategy;

public class IntegerAddStrategy implements CalculateStrategy<Integer,Double> {
    @Override
    public Double calculate(Integer value1, Integer value2) {
        return (double) (value1 + value2);
    }
}
