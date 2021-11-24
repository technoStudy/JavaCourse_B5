package Day7.ArraysMethods;

import java.util.Arrays;

public class _02_ArrasFillInTask {

    // create an array of strings of size 10
    // print the array
    // fill in with value "*"
    // print the array

    public static void main(String[] args) {

        String[] strArray = new String[10];

        System.out.println(Arrays.toString(strArray));

        Arrays.fill(strArray, "*");

        System.out.println(Arrays.toString(strArray));


        String emptyString = ""; // defined string but it's empty
        String nullString = null; // undefined

    }

}
