package StrategyWithFunctionInterface;


import java.util.Scanner;

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

            CalculateStrategy strategy = switch (operator) {
                case 1 -> Double::sum;
                case 2 -> (n1,n2) -> n1 - n2;
                case 3 -> (n1,n2) -> n1 * n2;
                case 4 -> (n1,n2) ->  (double) n1 / n2;
                default -> throw new RuntimeException("请输入1-4之间的正整数（包含1和4）！");
            };

            Context context = new Context();
            context.setStrategy(strategy);
            double result = context.executeStrategy(num1, num2);
            System.out.println("计算结果为:" + result);

            System.out.println("是否继续？(Y/N)");
            // nextInt只会读取整数内容，不会消耗换行符。nextLine会消耗换行符
            // 在nextInt读取完成后，遗留了一个换行符，此时被nextLine读取了，所以需要多读取一次
            reader.nextLine();
            String continueStr = reader.nextLine();
            if ("n".equals(continueStr) || "N".equals(continueStr)) {
                System.out.println("计算完成！程序退出...");
                break;
            }
        }
    }
}
