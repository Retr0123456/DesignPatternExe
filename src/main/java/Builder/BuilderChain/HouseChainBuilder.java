package Builder.BuilderChain;

import Builder.common.House;

// 链式生成器，在执行最终的方法之前，都是返回自身对象
public interface HouseChainBuilder {
    // 过程方法，返回自身
    HouseChainBuilder buildWall();

    HouseChainBuilder buildDoor();

    HouseChainBuilder buildWindow();

    HouseChainBuilder buildRoof();

    // 最终方法，返回具体的构建对象
    House buildHouse();
}
