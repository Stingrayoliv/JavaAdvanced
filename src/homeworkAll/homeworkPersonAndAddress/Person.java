package homeworkAll.homeworkPersonAndAddress;

import homeworkAll.homeworkBookingAndArrayList.Booking;

import java.util.ArrayList;
import java.util.List;

/**
 * JavaAdvanced
 * 30.08.20 20: 15
 */
public class Person {
    private String name;
    private String surname;
    private List<Address> listAddress;

    public Person(String name, String surname, List<Address> listAddress) {
        this.name = name;
        this.surname = surname;
        this.listAddress = listAddress;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public List<Address> getListAddress() {
        return listAddress;
    }

    public String fingEmailType() {
        String email = " ";
        for (Address address : listAddress) {
            if (address.getType().equals("email")) {
                email = address.getName();
            }
        }
        return email;
    }
}
