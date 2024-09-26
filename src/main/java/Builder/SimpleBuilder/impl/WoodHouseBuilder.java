package Builder.SimpleBuilder.impl;

import Builder.SimpleBuilder.HouseBuilder;
import Builder.common.House;
import Builder.common.components.Door;
import Builder.common.components.Roof;
import Builder.common.components.Wall;
import Builder.common.components.Window;

public class WoodHouseBuilder implements HouseBuilder {

    private final House house = new House();

    @Override
    public void buildWall() {
        Wall wall = new Wall();
        wall.setMaterial("木");
        house.setWall(wall);
    }

    @Override
    public void buildDoor() {
        Door door = new Door();
        door.setMaterial("木门");
        house.setDoor(door);
    }

    @Override
    public void buildWindow() {
        Window window = new Window();
        window.setType("木窗");
        house.setWindow(window);
    }

    @Override
    public void buildRoof() {
        Roof roof = new Roof();
        roof.setMaterial("木屋顶");
        house.setRoof(roof);
    }

    public House getHouse(){
        return house;
    }

}
