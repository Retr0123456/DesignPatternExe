package StrategyPattern.Strategy;

// 定义策略接口，不同计算方式实现这个接口
public interface CalculateStrategy {

    double calculate(double value1, double value2);
}
