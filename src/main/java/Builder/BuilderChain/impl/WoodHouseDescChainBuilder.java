package Builder.BuilderChain.impl;

import Builder.BuilderChain.HouseChainBuilder;
import Builder.common.HouseDescription;
import Builder.common.components.Door;
import Builder.common.components.Roof;
import Builder.common.components.Wall;
import Builder.common.components.Window;

public class WoodHouseDescChainBuilder implements HouseChainBuilder {

    private final HouseDescription description = new HouseDescription();

    @Override
    public WoodHouseDescChainBuilder buildWall() {
        Wall wall = new Wall();
        wall.setMaterial("木");
        wall.setDescription("由木头制成的墙");
        description.setWall(wall);
        return this;
    }

    @Override
    public WoodHouseDescChainBuilder buildDoor() {
        Door door = new Door();
        door.setMaterial("木门");
        door.setDescription("由木头制成的门");
        description.setDoor(door);
        return this;
    }

    @Override
    public WoodHouseDescChainBuilder buildWindow() {
        Window window = new Window();
        window.setType("木窗");
        window.setDescription("由木头制成的窗");
        description.setWindow(window);
        return this;
    }

    @Override
    public WoodHouseDescChainBuilder buildRoof() {
        Roof roof = new Roof();
        roof.setMaterial("木屋顶");
        roof.setDescription("由木头顶制成的屋顶");
        description.setRoof(roof);
        return this;
    }

    @Override
    public HouseDescription buildHouse() {
        return description;
    }
}
