package com.hotel;

import Hotel.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Comparator;


public class ArrayBookingListTest {
    BookingList bookingList;
    Booking b1;
    Booking b2;
    Booking b3;

    @Before
    public void initBookingList() {
        b1 = new Booking(
                new StandardRoom("1", 2),
                new Person("Nick3"),
                new DateInterval(new MyDate(5, 8, 2020),
                        new MyDate(10, 8, 2020))
        );


        b2 = new Booking(
                new SuiteRoom("2", 2),
                new Person("Nick1"),
                new DateInterval(new MyDate(22, 7, 2020),
                        new MyDate(13, 8, 2020))
        );


        b3 = new Booking(
                new SuiteRoom("3", 2),
                new Person("Nick2"),
                new DateInterval(new MyDate(16, 8, 2020),
                        new MyDate(13, 8, 2020))
        );
        bookingList = new ArrayBookingList(3);

        bookingList.add(b1);
        bookingList.add(b2);
        bookingList.add(b3);
    }

    @Test
    public void getSortedByNameArrayTest() {
        Comparator<Booking> comparator = new BookingComparatorByName();
        Booking[] resArray = bookingList.getSortedArray(comparator);
        Booking[] shouldArray = {b2, b3, b1};
        Assert.assertArrayEquals(shouldArray, resArray);
    }

    @Test
    public void getSortedByDateStartArrayTest() {
        Comparator<Booking> comparator = new BookingComparatorByDateStart();
        Booking[] resArray = bookingList.getSortedArray(comparator);
        Booking[] shouldArray = {b2, b1, b3};
        Assert.assertArrayEquals(shouldArray, resArray);
    }
}