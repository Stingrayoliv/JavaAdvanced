package homeworkAll.homework05.figures;

/**
 * JavaAdvanced
 * 06.07.20 21: 45
 */
public class Main {
    public static void main(String[] args) {
        Figure[] figures = DBMockFigure.getFigures();

        for (Figure figure: figures) {
            figure.findFigureArea();
        }
        
    }

}
