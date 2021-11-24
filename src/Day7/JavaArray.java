package Day7;

import java.util.Arrays;

public class JavaArray {

    public static void main(String[] args) {

        // Arrays are fixed-size which means once define the size
        // of the array you cannot change it!!!!!!!

        int variable; // how to declare a variable
        variable = 10; // how to initialize

        // [1, 5, 9, 2, 3]
        int[] myArray = new int[5]; // how to create an Array
        myArray[0] = 1;
        myArray[1] = 5;
        myArray[2] = 9;
        myArray[3] = 2;
        myArray[4] = 3;
//        myArray[5] = 0;  - we'll get an exception

        System.out.println(Arrays.toString(myArray));

        int[] arrayOfNumbers = {100, 1, 1000, 10000, 10};
        System.out.println("Length of arrayOfNumbers: " + arrayOfNumbers.length); // size of Array
        System.out.println(Arrays.toString(arrayOfNumbers));

        // to sort Array
        Arrays.sort(arrayOfNumbers);
        System.out.println(Arrays.toString(arrayOfNumbers));


        String[] arrayOfCars = { "Mercedes", "BMW", "Tesla", "Toyota", "Ford", "Honda" };
        System.out.println(Arrays.toString(arrayOfCars));

        Arrays.sort(arrayOfCars);
        System.out.println(Arrays.toString(arrayOfCars));

        System.out.println("Length of arrayOfCars: " + arrayOfCars.length);

        System.out.println(arrayOfCars[0]); // get one item from array - from index 0


    }

}
