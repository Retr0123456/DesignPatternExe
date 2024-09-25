package StrategyPattern;

import StrategyPattern.Strategy.CalculateStrategy;
import lombok.Setter;

public class Context {

    @Setter
    private CalculateStrategy strategy;

    public double executeStrategy(double num1, double num2){
        return strategy.calculate(num1,num2);
    }

}
