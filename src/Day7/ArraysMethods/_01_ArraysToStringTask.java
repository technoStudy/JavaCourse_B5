package Day7.ArraysMethods;

import java.util.Arrays;

public class _01_ArraysToStringTask {

    // create an array of int with 4 elements
    // assign each element a random value from 10 to 99
    // print the array using toString method
    // Part2: swap first and last elements, print the array again

    public static void main(String[] args) {

        int[] arrayOfInts = { 25, 78, 6, 39 };

        System.out.println(Arrays.toString(arrayOfInts));

        int lastIndex = arrayOfInts.length-1;
        int valueIndex0 = arrayOfInts[0];
        int valueLastIndex = arrayOfInts[lastIndex];

        arrayOfInts[0] = valueLastIndex; // { 39, 78, 6, 39 }
        arrayOfInts[lastIndex] = valueIndex0; // { 39, 78, 6, 25 }

        System.out.println(Arrays.toString(arrayOfInts));

    }

}
