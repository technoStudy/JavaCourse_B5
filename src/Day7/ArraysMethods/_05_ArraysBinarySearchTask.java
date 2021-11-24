package Day7.ArraysMethods;

import java.util.Arrays;

public class _05_ArraysBinarySearchTask {

    // create an array of fruits
    // sort the array
    // search for index of your favorite fruit
    // print both index and your favorite fruit

    public static void main(String[] args) {

        String[] fruits = { "Strawberry", "Kiwi", "Banana", "Mango" };

        Arrays.sort(fruits);

        int indexOfFavoriteFruit = Arrays.binarySearch(fruits, "Strawberry");

        System.out.println("index: " + indexOfFavoriteFruit + "\n" +
                           "favorite fruit: " + fruits[indexOfFavoriteFruit]);

    }

}
