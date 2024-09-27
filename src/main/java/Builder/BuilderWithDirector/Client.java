package Builder.BuilderWithDirector;

import Builder.SimpleBuilder.impl.WoodHouseBuilder;
import Builder.SimpleBuilder.impl.WoodHouseDescriptionBuilder;
import Builder.common.House;
import Builder.common.HouseDescription;

public class Client {
    // 使用导演类来控制构建流程，不需要客户端来控制
    public static void main(String[] args) {
        WoodHouseBuilder woodHouseBuilder = new WoodHouseBuilder();

        HouseDirector director = new HouseDirector(woodHouseBuilder);
        director.buildHouse();
        House house = woodHouseBuilder.getHouse();
        System.out.println(house);

        WoodHouseDescriptionBuilder woodHouseDescriptionBuilder = new WoodHouseDescriptionBuilder();
        director.setHouseBuilder(woodHouseDescriptionBuilder);
        director.buildHouse();
        HouseDescription houseDescription = woodHouseDescriptionBuilder.getHouseDescription();
        System.out.println(houseDescription);
    }
}
