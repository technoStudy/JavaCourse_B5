package Day39;

import java.util.*;

public class _04_ConvertingCollectionsTask {

    // create an array of random numbers of size 10
    // convert that array into a list

    // convert list into set

    public static void main(String[] args) {

        Integer[] array = new Integer[10];

        Random rnd = new Random();

        for (int i = 0; i < 10; i++)
            array[i] = rnd.nextInt(10);

        System.out.println("Array: " + Arrays.toString(array));


        List<Integer> listConvertedFromArray = new ArrayList<>(Arrays.asList(array));
        System.out.println("List converted from array: " + listConvertedFromArray);

        Set<Integer> integerSet = new HashSet<>(listConvertedFromArray);
        System.out.println(integerSet);

    }

}
