package Builder.SimpleBuilder;

// 建造者接口
// 不知道最后构建的是什么样的产品，因此获取产品的方法在Builder实现中定义
public interface HouseBuilder {
    void buildWall();
    void buildDoor();
    void buildWindow();
    void buildRoof();

    // 下面这种方式可以返回一个基类对象
    // House getHouse();

    // 也可以不在Builder接口定义对象，由Builder实现中直接返回具体对象
}
