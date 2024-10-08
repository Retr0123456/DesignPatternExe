package Builder.common;

import Builder.common.components.Door;
import Builder.common.components.Roof;
import Builder.common.components.Wall;
import Builder.common.components.Window;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class HouseDescription extends House{
    private Door door;
    private Window window;
    private Wall wall;
    private Roof roof;
}
