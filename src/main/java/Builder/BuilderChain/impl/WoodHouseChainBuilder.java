package Builder.BuilderChain.impl;

import Builder.BuilderChain.HouseChainBuilder;
import Builder.common.House;
import Builder.common.components.Door;
import Builder.common.components.Roof;
import Builder.common.components.Wall;
import Builder.common.components.Window;

public class WoodHouseChainBuilder implements HouseChainBuilder {
    private final House house = new House();
    @Override
    public WoodHouseChainBuilder buildWall() {
        Wall wall = new Wall();
        wall.setMaterial("木");
        house.setWall(wall);
        return this;
    }

    @Override
    public WoodHouseChainBuilder buildDoor() {
        Door door = new Door();
        door.setMaterial("木门");
        house.setDoor(door);
        return this;
    }

    @Override
    public WoodHouseChainBuilder buildWindow() {
        Window window = new Window();
        window.setType("木窗");
        house.setWindow(window);
        return this;
    }

    @Override
    public WoodHouseChainBuilder buildRoof() {
        Roof roof = new Roof();
        roof.setMaterial("木屋顶");
        house.setRoof(roof);
        return this;
    }

    @Override
    public House buildHouse() {
        return house;
    }
}
