package homeworkAll.homeworkPersonAndAdressWithoutBilling;

public class Address {
    private String address;
    private AddressType type;

    public Address(String address, AddressType type) {
        this.address = address;
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public AddressType getType() {
        return type;
    }

    @Override
    public String toString() {
        return address;
    }


}
