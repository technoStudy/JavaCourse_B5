package Day7.ArraysMethods;

import java.util.Arrays;

public class _03_ArraysEquals {

    public static void main(String[] args) {

        // equals method checks if both arrays have same values in same order

        int[] firstArray = {1, 3, 5};
        int[] secondArray = {3, 1, 5};
        int[] thirdArray = {1, 3, 5};

        System.out.println(Arrays.equals(firstArray, secondArray));
        System.out.println(Arrays.equals(firstArray, thirdArray));
        System.out.println(Arrays.equals(secondArray, thirdArray));



    }

}
