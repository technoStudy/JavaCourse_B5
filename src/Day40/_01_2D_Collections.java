package Day40;

import java.util.ArrayList;
import java.util.List;

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
        System.out.println("2D ArrayList: " + listOfLists);

    }

}
