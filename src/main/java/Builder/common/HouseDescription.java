package Builder.common;

import Builder.common.components.Door;
import Builder.common.components.Roof;
import Builder.common.components.Wall;
import Builder.common.components.Window;
import lombok.Data;

@Data
public class HouseDescription {
    private Door door;
    private Window window;
    private Wall wall;
    private Roof roof;

    public void showDescription(){
        System.out.println("House Description:");
        System.out.println("Door: "+door.getMaterial() + ":" + door.getDescription());
        System.out.println("Window: "+window.getType() + ":" + window.getDescription());
        System.out.println("Wall: "+wall.getMaterial() + ":" + wall.getDescription());
        System.out.println("Roof: "+roof.getMaterial() + ":" + roof.getDescription());
    }
}
