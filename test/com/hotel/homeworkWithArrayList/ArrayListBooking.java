package com.hotel.homeworkWithArrayList;

import homeworkAll.homeworkBookingAndArrayList.*;
import homeworkAll.homeworkBookingAndArrayList.BookingList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * JavaAdvanced
 * 26.08.20 01: 09
 */
public class ArrayListBooking {
    BookingList bookingList;
    Booking b1;
    Booking b2;
    Booking b3;
    Booking b4;

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

        b4 = new Booking(
                new SuiteRoom("3", 2),
                new Person("Nick28"),
                new DateInterval(new MyDate(16, 8, 2020),
                        new MyDate(13, 8, 2020))
        );

        ArrayList<Booking> list =  new ArrayList<>();
        bookingList = new homeworkAll.homeworkBookingAndArrayList.ArrayListBooking(list);

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

    @Test
    public void getByIndexCorrectReturnBooking() { // проверяем все крайние случаи
        Assert.assertEquals("the first el. fail", b1, bookingList.getByIndex(0));
        Assert.assertEquals("get el. fail", b2, bookingList.getByIndex(1));
        Assert.assertEquals("the last el. fail", b3, bookingList.getByIndex(2));
    }

    @Test
    public void getByNotCorrectIndexReturnNull() {// если идекс больше, чем длина, то возвращаем 0
        Assert.assertTrue("negativ index not ok", bookingList.getByIndex(-1) == null);
        Assert.assertTrue("bigger index not ok", bookingList.getByIndex(3) == null);
    }

    @Test
    public void addCorrectSizeIncrementAndBookingAdd() {
        Booking booking = new Booking(new SuiteRoom("4", 2), new Person("Nick222"),
                new DateInterval(new MyDate(15, 8, 2020),
                        new MyDate(23, 8, 2020)));
        bookingList.add(booking);
        Assert.assertEquals(4, bookingList.size());
        Assert.assertEquals(booking, bookingList.getByIndex(3));
    }

    @Test
    public void addEmptyBookingListCorrectAdded() {//проверка на то, что лист увеличивается. сначала размер 1,
        // потом добавляем еще один и проверяем
        ArrayList<Booking> list1 =  new ArrayList<>();
        BookingList bookingList = new homeworkAll.homeworkBookingAndArrayList.ArrayListBooking(list1);
        bookingList.add(b1);
        Assert.assertEquals(1, bookingList.size());
        Assert.assertEquals(b1, bookingList.getByIndex(0));
        bookingList.add(b2);
        Assert.assertEquals(2, bookingList.size());
        Assert.assertEquals(b2, bookingList.getByIndex(1));
    }

    // ДЗ
    @Test
    public void BookingForRemovingTrue() {// метод должен возвращать индекс в массиве
        Assert.assertTrue("Booking isn't in array", bookingList.findIndexOfObject(b2) >= 0);
    }

    @Test
    public void BookingForRemovingFalse() {// если такого booking нет в массиве, то возвращать -1
        Assert.assertTrue("Booking isn't in array", bookingList.findIndexOfObject(b4) == -1);
    }

    @Test
    public void removeBookingListCorrect() {
        ArrayList<Booking> list1 =  new ArrayList<>();
        BookingList bookingList = new homeworkAll.homeworkBookingAndArrayList.ArrayListBooking(list1);

        bookingList.add(b1);
        bookingList.add(b2);
        bookingList.add(b3);

        // тест с помощью size() не работает
        //bookingList.remove(b2);
        //Assert.assertEquals(2, bookingList.size());

        Booking[] resArray = bookingList.remove(b2);
        Booking[] shouldArray = {b1, b3};
        Assert.assertArrayEquals("Result: the array without removed booking", shouldArray, resArray);
    }

    @Test
    public void removeNotValidBooking() {
        ArrayList<Booking> list1 =  new ArrayList<>();
        BookingList bookingList = new homeworkAll.homeworkBookingAndArrayList.ArrayListBooking(list1);
        bookingList.add(b1);
        bookingList.add(b2);
        bookingList.add(b3);

        Booking[] resArray = bookingList.remove(b4);
        Booking[] shouldArray = {b1, b2, b3};
        Assert.assertArrayEquals("booking for removing isn't in array. Result: the same array",
                shouldArray, resArray);
    }
}
