package homeworkAll.homeworkPersonAndAdressWithoutBilling;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String firstName;
    private String secondName;
    private List<Address> addresses;

    public Person(String firstName, String secondName, List<Address> addresses) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.addresses = addresses;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    @Override
    public String toString() {
        return firstName + " " + secondName + " " + addresses;
    }

    //этот метод возвращает адреса с определенным типом
    public List<Address> getAddresses(AddressType type) {
        List<Address> res = new ArrayList<>();
        for (Address address : addresses) {
            if (address.getType().equals(type)) {
                res =null;
            } else {
                res=addresses;
            }
        }
        return res;
    }
}
