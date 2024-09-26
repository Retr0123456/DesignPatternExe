package Builder.common;

import Builder.common.components.Door;
import Builder.common.components.Roof;
import Builder.common.components.Wall;
import Builder.common.components.Window;
import lombok.Data;

@Data
public class House {
    private Door door;
    private Window window;
    private Wall wall;
    private Roof roof;
}
