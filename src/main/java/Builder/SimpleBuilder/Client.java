package Builder.SimpleBuilder;

import Builder.SimpleBuilder.impl.WoodHouseBuilder;
import Builder.SimpleBuilder.impl.WoodHouseDescriptionBuilder;
import Builder.common.House;
import Builder.common.HouseDescription;

public class Client {
    public static void main(String[] args) {
        WoodHouseBuilder houseBuilder = new WoodHouseBuilder();
        houseBuilder.buildWall();
        houseBuilder.buildWindow();
        houseBuilder.buildRoof();
        houseBuilder.buildDoor();
        House house = houseBuilder.getHouse();
        System.out.println(house);

        WoodHouseDescriptionBuilder descriptionBuilder = new WoodHouseDescriptionBuilder();
        descriptionBuilder.buildDoor();
        descriptionBuilder.buildRoof();
        descriptionBuilder.buildWall();
        descriptionBuilder.buildWindow();
        HouseDescription houseDescription = descriptionBuilder.getHouseDescription();
        houseDescription.showDescription();
    }
}
