package Strategy.StrategyWithGenerics.impl;

import Strategy.StrategyWithGenerics.CalculateStrategy;

public class LongSubStrategy implements CalculateStrategy<Long,Double> {
    @Override
    public Double calculate(Long value1, Long value2) {
        return (double) (value1 - value2);
    }
}
