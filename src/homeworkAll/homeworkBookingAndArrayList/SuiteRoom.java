package homeworkAll.homeworkBookingAndArrayList;

/**
 * JavaAdvanced
 * 31.07.20 20: 02
 */
public class SuiteRoom extends Room {
    private final double priceCoefficient = 1.3;

    public SuiteRoom(String number, int capacity) {
        super(number, capacity);
    }

    @Override
    public double getPrice() {
        return getBasePrice() * priceCoefficient;
    }

    @Override
    public String toString() {
        return "SuiteRom №" + getNumber() + " (" + getPrice() + ')';
    }
}
