package Day7.ArraysMethods;

import java.util.Arrays;

public class _02_ArraysFillIn {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        numbers[2] = 99;

        System.out.println(Arrays.toString(numbers));

        Arrays.fill(numbers, 1); // change all the values with 1

        System.out.println(Arrays.toString(numbers));



        String[] names = new String[100];

        System.out.println(Arrays.toString(names));

        Arrays.fill(names, "John"); // it will fill your array with "John" values

        System.out.println(Arrays.toString(names));
    }

}
