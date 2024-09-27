package Builder.LombokBuilder;

import Builder.common.components.Door;
import Builder.common.components.Roof;
import Builder.common.components.Wall;
import Builder.common.components.Window;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HouseDescriptionLombok {
    private Door door;
    private Window window;
    private Wall wall;
    private Roof roof;
}
