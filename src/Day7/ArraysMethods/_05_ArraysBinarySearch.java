package Day7.ArraysMethods;

import java.util.Arrays;

public class _05_ArraysBinarySearch {

    public static void main(String[] args) {

        // if you want to use binary search the array should be sorted

        int[] intArray = { 25, 10, 45, 5, 35, 90, 0 };

        Arrays.sort(intArray);

        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.binarySearch(intArray, 45));

    }

}
