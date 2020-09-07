package trianhleTwo;

/**
 * JavaAdvanced
 * 03.09.20 15: 19
 */
public class TriangleTwo {
    public static void main(String[] args) {
        triangleOne(6);
    }

    private static void triangleOne(int n) {
        String symbol = "*";
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n * 2 - 1; j++) {
                if (j <= n - i || j >= n + i) {
                    System.out.print(symbol);
                }
            }
            System.out.println();
        }
    }
}
