package Builder.SimpleBuilder;

// 建造者接口
// 不知道最后构建的是什么样的产品，因此获取产品的方法在Builder实现中定义
public interface HouseBuilder {
    void buildWall();
    void buildDoor();
    void buildWindow();
    void buildRoof();
}
