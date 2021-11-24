package Day8.MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArrayTask {

    //                TASK
    // Create a 2d String array
    // { { "USA", "DC" }, { "France", "Paris" }, { "Germany", "Berlin" } }
    // Print the Array
    // Print "Berlin"

    public static void main(String[] args) {

        String[][] countriesAndCapitols = new String[3][2];
        countriesAndCapitols[0][0] = "USA";
        countriesAndCapitols[0][1] = "DC";
        countriesAndCapitols[1][0] = "France";
        countriesAndCapitols[1][1] = "Paris";
        countriesAndCapitols[2][0] = "Germany";
        countriesAndCapitols[2][1] = "Berlin";

        System.out.println(Arrays.deepToString(countriesAndCapitols));
        System.out.println(countriesAndCapitols[2][1]);

    }

}
