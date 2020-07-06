package homeworkAll.homeworkPaint04;

/**
 * JavaAdvanced
 * 06.07.20 17: 47
 */
public class MaterialArray {
    private Material[] materials;

    public MaterialArray(Material[] materials) {
        this.materials = materials;
    }

    public void printAll() {
        System.out.println("//----//----//----print all materials----//----//----//");
        for (Material material : materials) {
            System.out.println(material);
        }
    }

    public void buyMaterialExtra() {
        System.out.println("//----//----//----buy additional materials----//----//----//");
        for (Material material : materials) {
            material.buyAdditionalMaterials();
        }
    }

    public void showOptionForLearning() { // для обучения красками нужно учиться либо с учителем, либо
        System.out.println("//----//----//--------//----//----//");
        for (Material material : materials) {
            if (isPaint(material)) {
                System.out.println("paint name: " + material.getName() + " training options:");
                ((Paint) material).findLearningOption();
            }

        }
    }

    private boolean isPaint(Material material) {
        if (material instanceof Paint) { // является ли employee object класса Programmer
            return true;
        }
        return false;
    }
}
