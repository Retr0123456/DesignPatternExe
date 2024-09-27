package Builder.BuilderChain;

import Builder.BuilderChain.impl.WoodHouseChainBuilder;
import Builder.BuilderChain.impl.WoodHouseDescChainBuilder;
import Builder.common.House;
import Builder.common.HouseDescription;

public class Client {

    public static void main(String[] args) {
        WoodHouseChainBuilder chainBuilder = new WoodHouseChainBuilder();
        House house = chainBuilder.buildWall().buildWindow().buildDoor().buildRoof().buildHouse();
        System.out.println(house);

        HouseDescription houseDescription = new WoodHouseDescChainBuilder().buildWall().buildWindow().buildDoor().buildRoof().buildHouse();
        System.out.println(houseDescription);
    }
}
