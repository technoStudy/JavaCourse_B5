package Day19;

import java.util.Random;

public class Task_VoidMethods_Homework {

//    ||This Part Should be in Main Method||
//
//     -Create an array of size 5, assign some random values from 1 to 10
//     -(use random class and for loop to assign values)
//
//
//    ||You should create public static void methods for each (Parameter should be int Array for methods)||
//
//     -1-Create a method that prints array like "2 3 1 10 2", space between elements of array
//     -2-Create a method that prints the sum of an array
//     -3-Create a method that prints the max element of an array
//
//    P.S: Return type should be void because we are not returning anything just printing


    public static void main(String[] args) {
        Random random = new Random();

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = random.nextInt(10) + 1;

        printArrayInTheSameLine(numbers);
        sumOfArray(numbers);
        maxElementOfAnArray(numbers);

    }

    public static void printArrayInTheSameLine(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }


    public static void sumOfArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i];
        System.out.println("sum: " + sum);
    }


    public static void maxElementOfAnArray(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++)
            maxValue = Math.max(array[i], maxValue);
        System.out.println(maxValue);
    }


}
