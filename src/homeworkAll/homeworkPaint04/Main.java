package homeworkAll.homeworkPaint04;

/**
 * JavaAdvanced
 * 06.07.20 17: 30
 */
public class Main {
    public static void main(String[] args) {
        MaterialArray material01 = new MaterialArray(DBMockMaterial.getMaterials());
        material01.printAll();
        material01.buyMaterialExtra();
        material01.showOptionForLearning();

    }
}
