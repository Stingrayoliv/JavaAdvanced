package homeworkAll.homeworkPaint04;

/**
 * JavaAdvanced
 * 06.07.20 17: 33
 */
public class DBMockMaterial {
    private static Material[] materials = {
            new Graf("Faber castel", "black", 25.20),
            new Pastel("Derwent", "12 colors set", 35.20),
            new Oil("Sonat", "white", 5.50),
            new Aquarelle("Schmincke akademie", "24 colors set", 20.0)
    };

    public static Material[] getMaterials() {
        return materials;
    }
}
