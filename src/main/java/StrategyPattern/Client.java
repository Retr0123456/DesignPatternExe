package StrategyPattern;

import StrategyPattern.Strategy.CalculateStrategy;
import StrategyPattern.Strategy.impl.AddStrategy;
import StrategyPattern.Strategy.impl.DivStrategy;
import StrategyPattern.Strategy.impl.MulStrategy;
import StrategyPattern.Strategy.impl.SubStrategy;

import java.util.Scanner;

// 客户端负责初始化策略、上下文，以及选择哪一种策略进行计算
public class Client {
    public static void main(String[] args) {
        while (true){
            System.out.println("输入第一个数：");
            Scanner reader = new Scanner(System.in);
            int num1 = reader.nextInt();

            System.out.println("输入第二个数：");
            int num2 = reader.nextInt();

            String calculateDescription = """
                1: 加
                2: 减
                3: 乘
                4: 除
            """;

            System.out.println(calculateDescription);
            System.out.println("输入对于运算符的编号：");
            int operator = reader.nextInt();

            CalculateStrategy  strategy = switch (operator) {
                case 1 -> new AddStrategy();
                case 2 -> new SubStrategy();
                case 3 -> new MulStrategy();
                case 4 -> new DivStrategy();
                default -> throw new RuntimeException("请输入1-4之间的正整数（包含1和4）！");
            };

            Context context = new Context();
            context.setStrategy(strategy);
            double result = context.executeStrategy(num1, num2);
            System.out.println("计算结果为:" + result);

            System.out.println("是否继续？(Y/N)");
            Scanner readerStr = new Scanner(System.in);
            String continueStr = readerStr.nextLine();
            if ("n".equals(continueStr) || "N".equals(continueStr)) {
                System.out.println("计算完成！程序退出...");
                break;
            }
        }
    }
}
