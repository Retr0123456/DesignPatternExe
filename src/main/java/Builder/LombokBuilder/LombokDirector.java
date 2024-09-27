package Builder.LombokBuilder;

import Builder.common.components.Door;
import Builder.common.components.Roof;
import Builder.common.components.Wall;
import Builder.common.components.Window;

// 这里没有组合一个抽象的Builder 接口，而是直接使用不同的Builder类来进行构建
// 应根据实际情况调整设计模式的实现
public class LombokDirector {

    public HouseLombok buildWoodHouse(String material) {
        Wall wall = new Wall();
        wall.setMaterial(material);
        Window window = new Window();
        window.setType(material);
        Door door = new Door();
        door.setMaterial(material);
        Roof roof = new Roof();
        roof.setMaterial(material);

        return HouseLombok.builder().wall(wall)
                .door(door)
                .window(window)
                .roof(roof).build();
    }

    public HouseDescriptionLombok buildWoodHouseDesc(String material) {
        Wall wall = new Wall();
        wall.setMaterial(material);
        wall.setDescription("木");
        Window window = new Window();
        window.setType(material);
        window.setDescription("木");
        Door door = new Door();
        door.setMaterial(material);
        door.setDescription("木");
        Roof roof = new Roof();
        roof.setMaterial(material);
        roof.setDescription("木");

        return HouseDescriptionLombok.builder().wall(wall)
                .door(door)
                .window(window)
                .roof(roof).build();
    }
}
