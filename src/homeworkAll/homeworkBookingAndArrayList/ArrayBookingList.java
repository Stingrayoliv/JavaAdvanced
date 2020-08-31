//package homeworkAll.homeworkBookingAndArrayList;
//
//import java.util.Arrays;
//import java.util.Comparator;
//
///**
// * JavaAdvanced
// * 04.08.20 21: 25
// */
//public class ArrayBookingList implements BookingList {
//    private Booking[] bookings;
//    private int size = 0;
//    private int capacity = 3;
//
//    public ArrayBookingList(int capacity) {
//        this.capacity = capacity;
//        bookings = new Booking[this.capacity];
//    }
//
//    @Override
//    public void add(Booking booking) {
//        if (size < capacity) {
//            bookings[size++] = booking;
//        } else {
//            capacity *= 2;
//            Booking[] temp = new Booking[capacity];
//            for (int i = 0; i < bookings.length; i++) {
//                temp[i] = bookings[i];
//            }
//            bookings = temp;
//            bookings[size++] = booking;
//        }
//    }
//
//    @Override
//    public Booking getByIndex(int i) {
//        if (i < 0 || i > size - 1) {
//            return null;
//        } else {
//            return bookings[i];
//        }
//    }
//
//    public Booking[] remove(Booking o) {// первый метод удаления
//        int index=findIndexOfObject(o);
//        Booking[] res = bookings;
//        if ((index >= 0) && (index < bookings.length)) {
//            res = new Booking[bookings.length - 1];
//            for (int i = 0, j = 0; i < bookings.length; i++) {
//                if (i != index) {
//                    res[j] = bookings[i];
//                    j++; // или сразу записать res[j++]=array[i];
//                }
//            }
//            bookings = res;
//        }
//        return res;
//    }
//
//    //Generic function to find the index of an element in an object array in Java
//    public int findIndexOfObject(Booking o) {
//        for (int i = 0; i < bookings.length; i++) {
//            if (o.equals(bookings[i]))
//                return i;
//        }
//        return -1;
//    }
//
//    @Override
//    public int size() {
//        return size;
//    }
//    @Override
//    public void print() {
////        for (int i = 0; i < size; i++) {
////            System.out.println(bookings[i]);
//        //}
//        for (Booking b : bookings) {
//            System.out.println(b.toString());
//        }
//    }
//
//    @Override
//    public Booking[] getSortedArray(Comparator<Booking> comparator) {
//        Booking[] res = Arrays.copyOf(bookings, bookings.length);// создает новый массив
//        Arrays.sort(res, comparator);
//        return res;
//    }
//}
