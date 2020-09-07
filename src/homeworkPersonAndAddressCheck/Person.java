package homeworkPersonAndAddressCheck;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String firstName;
    private String secondName;
    private List<PersonAddress> addresses;

    public Person(String firstName, String secondName, List<PersonAddress> addresses) {
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

    public List<PersonAddress> getAddresses() {
        return addresses;
    }

    @Override
    public String toString() {
        return  firstName +" "+secondName +" "+addresses;
    }

     //этот метод возвращает адреса с определенным типом
    public List<PersonAddress> getAddresses(AddressType type) {
        List<PersonAddress> res = new ArrayList<>();
        for (PersonAddress address : addresses) {
            if (address.getType().equals(type)) {
                res.add(address);
            }
        }
        return res;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
        if (secondName != null ? !secondName.equals(person.secondName) : person.secondName != null) return false;
        return addresses != null ? addresses.equals(person.addresses) : person.addresses == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + (addresses != null ? addresses.hashCode() : 0);
        return result;
    }
}
