package homeworkAll.homework14Hotel;

/**
 * JavaAdvanced
 * 31.07.20 20: 00
 */
public class StandardRoom extends Room {
    private final double priceCoefficient = 1.0;


    public StandardRoom(String number, int capacity) {
        super(number, capacity);
    }

    @Override
    public double getPrice() {
        return getBasePrice() * priceCoefficient;
    }

    @Override
    public String toString() {
        return "StandardRoom №" + getNumber() + " (" + getPrice() + ')';
    }
}
