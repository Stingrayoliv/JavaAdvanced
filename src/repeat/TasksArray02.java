package repeat;
import java.util.Arrays;

/**
 * JavaAdvanced
 * 22.07.20 20: 53
 */
public class TasksArray02 {
    public static void main(String[] args) {
        //Arrays-02-02
//        int[] a = {1, 2, 2, 1};//6
//        int[] a1 = {1, 1};//2
//        int[] a2 = {1, 2, 2, 1, 13};//6
//        System.out.println(sum13(a));
//        System.out.println(sum13(a1));
//        System.out.println(sum13(a2));

        //Arrays-02-03
//        int[] b = {0, 2, 4};// true
//        int[] b1 = {1, 2, 3};//false
//        int[] b2 = {1, 2, 4};//false
//        System.out.println(lucky13(b));
//        System.out.println(lucky13(b1));
//        System.out.println(lucky13(b2));

        //Arrays-02-04
//        System.out.println(Arrays.toString(fizzArray(4)));//[0, 1, 2, 3]
//        System.out.println(Arrays.toString(fizzArray(1)));//[0]
//        System.out.println(Arrays.toString(fizzArray(10)));//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        //Arrays-02-06
//        int[] c = {1, 2, 3};
//        int[] c1 = {1, 2, 3};
//        int[] c2 = {1, 2, 3};
//        int[] d = {2, 3, 10};
//        int[] d1 = {2, 3, 5};
//        int[] d2 = {2, 3, 3};
//        System.out.println(matchUp(c, d));//2
//        System.out.println(matchUp(c1, d1));//3
//        System.out.println(matchUp(c2, d2));//2
        //Arrays-02-07
//        int[] l = {2, 1, 3, 5};//true
//        int[] l1 = {2, 1, 2, 5};//false
//        int[] l2 = {2, 4, 2, 5};//true
//        System.out.println(modThree(l));//true
//        System.out.println(modThree(l1));//false
//        System.out.println(modThree(l2));//true
        //Arrays-02-10
//        int[] k = {2, 4, 1, 2};//[1, 2]
//        int[] k1 = {4, 1, 4, 2};//[2]
//        int[] k2 = {4, 4, 1, 2, 3};//[1, 2, 3]
//        System.out.println(Arrays.toString(post4(k)));
        //System.out.println(Arrays.toString(post4(k1))); //пересмотреть
        //System.out.println(Arrays.toString(post4(k2)));//пересмотреть


//        Arrays-02-12
//        System.out.println(Arrays.toString(showFizzBuzz(1, 6))); //["1", "2", "Fizz", "4", "Buzz"]
//        System.out.println(Arrays.toString(showFizzBuzz(1, 8))); //["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
//        System.out.println(Arrays.toString(showFizzBuzz(1, 11))); //["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]
    }

    //Arrays-02-10 (посмотреть 2 и 3)
    public static int[] post4(int[] array) {
        for (int i = array.length-1; i >= 0; i--) {// потому что элементы после последней 4-ки
            if (array[i] == 4){
                int[] output;
                output = new int[array.length-i-1];
                for (int j = 0; j<output.length; j++) {
                    output[i]=array[i+j+1];
                }
                return output;
            }
        }
        int[] array1;
        array1=new int[0];
        return array1;
    }


    //Arrays-02-07
    //Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other
    public static boolean modThree(int[] array) {
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] % 2 == 0 && array[i + 1] % 2 == 0 && array[i + 2] % 2 == 0) {
                return true;
            }
            if (array[i] % 2 != 0 && array[i + 1] % 2 != 0 && array[i + 2] % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    //Arrays-02-06
    //Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element
    // in nums2 (at the same index). Return the count of the number of times that the two elements differ by 2 or less,
    // but are not equal.
    public static int matchUp(int[] nums1, int[] nums2) {
        int times = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (Math.abs(nums1[i] - nums2[j]) >= 0 && Math.abs(nums1[i] - nums2[j]) <= 2) {
                    times++;
                }
            }
            return times;

        }


        return times;
    }

    //Arrays-02-04
    // Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1.
    // The given n may be 0, in which case just return a length 0 array. You do not need a separate if-statement
    // for the length-0 case; the for-loop should naturally execute 0 times in that case, so it just works. The syntax
    // to make a new int array is: new int[desired_length] (See also: FizzBuzz Code)
    public static int[] fizzArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
        return array;
    }


    //Arrays-02-03
    // Given an array of ints, return true if the array contains no 1's and no 3's.
    public static boolean lucky13(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1 || array[i] == 3) return false;
        }
        return true;
    }

    //Arrays-02-02
    //Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky,
    // so it does not count and numbers that come immediately after a 13 also do not count.
    public static int sum13(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 13) {
                sum += array[i];
            }
            if (array[i] == 13) {
                return sum;
            }
        }
        return sum;
    }

    //Arrays-02-12
    // This is slightly more difficult version of the famous FizzBuzz problem which is sometimes given as a first
    // problem for job interviews. (See also: FizzBuzz Code.) Consider the series of numbers beginning at start
    // and running up to but not including end, so for example start=1 and end=5 gives the series 1, 2, 3, 4.
    // Return a new String[] array containing the string form of these numbers, except for multiples of 3,
    // use "Fizz" instead of the number, for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use
    // "FizzBuzz". In Java, String.valueOf(xxx) will make the String form of an int or other type.
    // This version is a little more complicated than the usual version since you have to allocate and index into
    // an array instead of just printing, and we vary the start/end instead of just always doing 1..100.
    public static String[] showFizzBuzz(int start, int end) {
        String[] output = new String[end - start];
        for (int i = start; i < end; i++) {
            if (i % 3 == 0 && i % 5 == 0) { // данное условие должно стоять на первом месте
                output[i - start] = "FizzBuzz";
            } else if (i % 3 == 0) {
                output[i - start] = "Fizz";
            } else if (i % 5 == 0) {
                output[i - start] = "Buzz";
            } else {
                output[i - start] = String.valueOf(i);
            }
        }
        return output;
    }
}
