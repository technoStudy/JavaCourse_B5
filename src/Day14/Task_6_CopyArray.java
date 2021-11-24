package Day14;

import java.util.Arrays;

public class Task_6_CopyArray {

    // PART 1
    // declare an array of veggies and initialize it with some values use array = {}
    // print all elements

    // PART 2
    // make a copy of that array (by values)

    public static void main(String[] args) {

        // PART 1
        String[] veggies = {"Onion", "Celery", "Carrot", "Fennel"}; // Original Array

        for (int i = 0; i < veggies.length; i++) {
            System.out.println(veggies[i]);
        }


        // PART 2
        String[] copyOfVeggies = new String[veggies.length];

//        copyOfVeggies[0] = veggies[0];
//        copyOfVeggies[1] = veggies[1];
//        copyOfVeggies[2] = veggies[2];
//        copyOfVeggies[3] = veggies[3];

        for (int i = 0; i < veggies.length; i++) {
            copyOfVeggies[i] = veggies[i];
        }

        System.out.println(Arrays.toString(copyOfVeggies));

    }

}
