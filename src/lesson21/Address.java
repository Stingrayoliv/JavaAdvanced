package lesson21;

/**
 * JavaAdvanced
 * 17.08.20 19: 52
 */
public class Address {
    private String city;
    private String street;


    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
