package Builder.SimpleBuilder.impl;

import Builder.SimpleBuilder.HouseBuilder;
import Builder.common.HouseDescription;
import Builder.common.components.Door;
import Builder.common.components.Roof;
import Builder.common.components.Wall;
import Builder.common.components.Window;

public class WoodHouseDescriptionBuilder implements HouseBuilder {

    private final HouseDescription houseDescription = new HouseDescription();

    @Override
    public void buildWall() {
        Wall wall = new Wall();
        wall.setMaterial("木");
        wall.setDescription("由木头制成的墙");
        houseDescription.setWall(wall);
    }

    @Override
    public void buildDoor() {
        Door door = new Door();
        door.setMaterial("木门");
        door.setDescription("由木头制成的门");
        houseDescription.setDoor(door);
    }

    @Override
    public void buildWindow() {
        Window window = new Window();
        window.setType("木窗");
        window.setDescription("由木头制成的窗");
        houseDescription.setWindow(window);
    }

    @Override
    public void buildRoof() {
        Roof roof = new Roof();
        roof.setMaterial("木屋顶");
        roof.setDescription("由木头顶制成的屋顶");
        houseDescription.setRoof(roof);
    }

    public HouseDescription getHouseDescription() {
        return houseDescription;
    }
}
