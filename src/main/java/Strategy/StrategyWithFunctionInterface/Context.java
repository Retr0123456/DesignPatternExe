package Strategy.StrategyWithFunctionInterface;

import lombok.Setter;

public class Context {

    @Setter
    private CalculateStrategy strategy;

    public double executeStrategy(int num1, int num2){
        return strategy.calculate(num1,num2);
    }
}
