package Builder.BuilderWithDirector;

import Builder.SimpleBuilder.HouseBuilder;
import lombok.AllArgsConstructor;
import lombok.Setter;


// 其他的代码引用之前的包
// 导演类负责控制生成器的构建流程
@AllArgsConstructor
public class HouseDirector {
    @Setter
    private HouseBuilder houseBuilder;

    // common case:
    public void buildHouse(){
        houseBuilder.buildWall();
        houseBuilder.buildDoor();
        houseBuilder.buildWindow();
        houseBuilder.buildRoof();
    }

    // case 1:
    //  public House buildWoodHouse(WoodHouseBuilder builder)
    //  public House buildStoneHouse(StoneHouseBuilder builder)

    // case 2:
//    public House buildWoodHouse(WoodHouseBuilder builder){
//        WoodHouseBuilder builder = (WoodHouseBuilder) houseBuilder;
//        ....
//    }
}
