package homeworkPersonAndAddressCheck;

public class PersonAddress {
    private String address;
    private AddressType type;

    public PersonAddress(String address, AddressType type) {
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
        return "Address:" + '(' + address + ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonAddress that = (PersonAddress) o;

        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        return type == that.type;
    }

    @Override
    public int hashCode() {
        int result = address != null ? address.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
