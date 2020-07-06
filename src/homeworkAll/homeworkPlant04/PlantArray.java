package homeworkAll.homeworkPlant04;

/**
 * JavaAdvanced
 * 05.07.20 20: 32
 */
public class PlantArray {
    private Plant[] plants;

    public PlantArray(Plant[] plants) {
        this.plants = plants;
    }

    public void printAll() { //print all plants in array
        System.out.println("//----//----//----All plants----//----//----//");
        for (Plant plant : plants) {
            System.out.println(plant);
        }
    }

    public void springGrowth() {
        System.out.println("//----//----//----plant growth in spring----//----//----//");
        for (Plant plant : plants) {
            System.out.println(plant.getName() + " " + plant.showSpringGrowth());
        }
    }

    public void summerGrowth() {
        System.out.println("//----//----//----plant growth in summer----//----//----//");
        for (Plant plant : plants) {
            System.out.println(plant.getName() + " " + plant.showSummerGrowth());
        }
    }

    public void autumnGrowth() {
        System.out.println("//----//----//----plant growth in autumn----//----//----//");
        for (Plant plant : plants) {
            System.out.println(plant.getName() + " " + plant.showAutumnGrowth());
        }
    }

    public void winterGrowth() {
        System.out.println("//----//----//----plant growth in winter----//----//----//");
        for (Plant plant : plants) {
            System.out.println(plant.getName() + " " + plant.showWinterGrowth());
        }
    }


    public void yearGrowth() { //рост всех растений за год
        System.out.println("//----//----//----plant growth per year----//----//----//");
        for (Plant plant : plants) {
            plant.showYearGrowth();
        }
    }

    public void yearGrowthTrees() {
        System.out.println("//----//----//----plant growth per year only for TREES----//----//----//");
        for (Plant plant : plants) {
            if (plant.getInitialGrowth() == 150) {
                plant.showYearGrowth();
            }
        }
    }


}

