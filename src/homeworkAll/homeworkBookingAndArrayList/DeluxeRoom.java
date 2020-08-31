package Hotel;

/**
 * JavaAdvanced
 * 31.07.20 20: 03
 */
public class DeluxeRoom extends Room {
    private final double priceCoefficient = 1.5;
    private final double deLexeTax = 50.0;


    public DeluxeRoom(String number, int capacity) {
        super(number, capacity);
    }

    @Override
    public double getPrice() {
        return getBasePrice() * priceCoefficient * deLexeTax;
    }

    @Override
    public String toString() {
        return "DeluxeRoom №" + getNumber() + " (" + getPrice() + ')';
    }

}
