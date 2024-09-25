package Strategy.StrategyPattern;

import Strategy.StrategyPattern.Strategy.CalculateStrategy;
import lombok.Setter;

// 上下文组合策略接口，调用策略接口的方法
// 上下文无需关注使用哪一种策略
public class Context {

    @Setter
    private CalculateStrategy strategy;

    public double executeStrategy(double num1, double num2){
        return strategy.calculate(num1,num2);
    }

}
