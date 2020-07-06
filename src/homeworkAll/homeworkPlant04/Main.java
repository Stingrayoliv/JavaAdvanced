package homeworkAll.homeworkPlant04;

/**
 * JavaAdvanced
 * 05.07.20 22: 39
 */
public class Main {
    public static void main(String[] args) {
        PlantArray plant1 = new PlantArray(DBMockPlants.getPlants());
        plant1.printAll();
        plant1.springGrowth();
        plant1.summerGrowth();
        plant1.autumnGrowth();
        plant1.winterGrowth();
        plant1.yearGrowth();
        plant1.yearGrowthTrees();

    }
}
