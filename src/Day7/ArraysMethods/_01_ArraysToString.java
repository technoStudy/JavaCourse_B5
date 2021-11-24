package Day7.ArraysMethods;

import java.util.Arrays;

public class _01_ArraysToString {

    public static void main(String[] args) {

        int[] arrayOfInts = new int[100];

        arrayOfInts[0] = 5;
        arrayOfInts[99] = 10;

        System.out.println(Arrays.toString(arrayOfInts));

        // lastIndex = lengthOfArray - 1
        int lastIndex = arrayOfInts.length - 1;

        arrayOfInts[lastIndex] = 30; // update index in array

        System.out.println(Arrays.toString(arrayOfInts));

    }

}
