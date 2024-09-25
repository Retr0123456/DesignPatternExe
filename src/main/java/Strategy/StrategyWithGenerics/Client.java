package Strategy.StrategyWithGenerics;


import Strategy.StrategyWithGenerics.impl.DoubleMulStrategy;
import Strategy.StrategyWithGenerics.impl.FloatDivStrategy;
import Strategy.StrategyWithGenerics.impl.IntegerAddStrategy;
import Strategy.StrategyWithGenerics.impl.LongSubStrategy;

public class Client {

    public static void main(String[] args) {

        IntegerAddStrategy addStrategy = new IntegerAddStrategy();
        LongSubStrategy subStrategy = new LongSubStrategy();
        DoubleMulStrategy mulStrategy = new DoubleMulStrategy();
        FloatDivStrategy divStrategy = new FloatDivStrategy();

        Context context = new Context();
        context.registerStrategy(Integer.class, addStrategy);
        context.registerStrategy(Long.class, subStrategy);
        context.registerStrategy(Double.class, mulStrategy);
        context.registerStrategy(Float.class, divStrategy);


        System.out.println("计算结果为:" + context.executeStrategy(1,10));
        System.out.println("计算结果为:" + context.executeStrategy(5L,7L));
        System.out.println("计算结果为:" + context.executeStrategy(5.0d,5.0d));
        System.out.println("计算结果为:" + context.executeStrategy(25.0f,5.0f));


    }
}
