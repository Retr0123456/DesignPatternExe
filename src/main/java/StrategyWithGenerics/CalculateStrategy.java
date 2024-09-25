package StrategyWithGenerics;

// 这里可以强制R为某一个固定类型
// 设置成泛型可以增加可变性
@FunctionalInterface
public interface CalculateStrategy<T, R> {
    R calculate(T value1, T value2);
}
