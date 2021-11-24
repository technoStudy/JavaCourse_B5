package Day7;

import java.util.Arrays;

public class Task3 {

    // declare an array of doubles and initialize it with some values | use array = {}
    // print the array
    // then sort array and print again


    public static void main(String[] args) {

        double[] arrayOfDoubles = {1.4, 0.78, 3.98, 0.01};

        System.out.println(Arrays.toString(arrayOfDoubles));

        Arrays.sort(arrayOfDoubles);

        System.out.println(Arrays.toString(arrayOfDoubles));

    }

}
