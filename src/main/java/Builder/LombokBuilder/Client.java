package Builder.LombokBuilder;

public class Client {
    public static void main(String[] args) {
        LombokDirector director = new LombokDirector();
        HouseLombok wood = director.buildWoodHouse("wood");
        System.out.println(wood);

        HouseDescriptionLombok descriptionLombok = director.buildWoodHouseDesc("木头");
        System.out.println(descriptionLombok);
    }
}
