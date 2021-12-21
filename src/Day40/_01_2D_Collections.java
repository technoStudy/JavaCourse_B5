package Day40;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_2D_Collections {

    public static void main(String[] args) {

        // 2D Array
        int[][] twoDArray = new int[1][1];

        // This is an ArrayList which can contains String ArrayLists
        ArrayList<ArrayList<String>> listOfLists = new ArrayList<>();

            ArrayList<String> cars = new ArrayList<>();
            cars.add("Hyundai");
            cars.add("Toyota");
            cars.add("Ford");

            ArrayList<String> cities = new ArrayList<>();
            cities.add("Brooklyn");
            cities.add("London");
            cities.add("Paris");

        listOfLists.add(cars);
        listOfLists.add(cities);

        System.out.println(cars);
        System.out.println(cities);

        // Printing 2D ArrayList
        System.out.println("2D ArrayList which stores ArrayLists: " + listOfLists);


        // Store HashSets inside an ArrayList
        ArrayList<HashSet<Integer>> listOfSets = new ArrayList<>();

            HashSet<Integer> firstSet = new HashSet<>();
            firstSet.add(10);
            firstSet.add(20);

            HashSet<Integer> secondSet = new HashSet<>();
            secondSet.add(10);
            secondSet.add(20);
            secondSet.add(30);
            secondSet.add(40);
            secondSet.add(30); // Sets don't allow duplicates!!

        listOfSets.add(firstSet);
        listOfSets.add(secondSet);

        System.out.println("2D ArrayList which stores Sets: " + listOfSets);

    }

}
