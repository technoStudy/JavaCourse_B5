package Day7.ArraysMethods;

import java.util.Arrays;

public class _04_ArraysSortTask {

    // create an int array of random numbers of size 5
    // Find the min and max value in the Array and print

    public static void main(String[] args) {

        int[] numbers = { 87231, 572810, 43291, 3241, 9488 };

        Arrays.sort(numbers);

        System.out.println("MIN: " + numbers[0]);
        System.out.println("MAX: " + numbers[numbers.length-1]);

    }

}
