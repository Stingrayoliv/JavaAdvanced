package homeworkAll.homeworkPlant04;

/**
 * JavaAdvanced
 * 05.07.20 20: 47
 */
public class DBMockPlants {
    private static Plant[] plants = {
            new Tree("Apple tree", 150, 15, 15, 5, 5),
            new Tree("Spruce", 150, 15, 15, 5, 5),
            new Flower("Сhamomile", 0, 20, 10, 0, 0),
            new Flower("Lavender", 0, 20, 10, 0, 0),
            new Bush("Japanese Maples", 40, 10, 10, 3, 0),
            new Bush("Oleander", 40, 10, 10, 3, 0),
    };

    public static Plant[] getPlants() {
        return plants;
    }
}
