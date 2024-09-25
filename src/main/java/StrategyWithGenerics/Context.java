package StrategyWithGenerics;

import java.util.HashMap;
import java.util.Map;

// 增强的context，会根据参数的类型，自动选择合适的策略
// context仍然不关心选择了哪个策略，注册策略的代码在client中
public class Context {

    private final Map<Class<?>,CalculateStrategy<?,?>> strategyMap = new HashMap<>();

    public <T,R> void registerStrategy(Class<T> clazz,CalculateStrategy<T,R> strategy){
        strategyMap.put(clazz,strategy);
    }

    public <T, R> R executeStrategy(T num1, T num2){
        @SuppressWarnings("unchecked")
        CalculateStrategy<T,R> calculateStrategy = (CalculateStrategy<T, R>) strategyMap.get(num1.getClass());

        if (calculateStrategy != null) {
            return calculateStrategy.calculate(num1,num2);
        }else {
            throw new RuntimeException("错误的参数类型，未找到对应处理策略！");
        }
    }
}
