package Day6.StringMethodsTasks;

import java.util.Date;

public class TASK {

    // First create a Date object which is "now" (Date now = new Date();)
    // Then convert this 'now' variable to a String
    // Now replace all numbers with '*'
    // And check if the first Date object is equal to our string

    public static void main(String[] args) {

        Date now = new Date();
        System.out.println("Date object: " + now);

        String convertedNow = now.toString(); // date object converted to String
        System.out.println("Date converted to String: " + convertedNow);

        String numbersConvertedToStar = convertedNow.replaceAll("[0-9]", "*"); // replacing numbers with *
        System.out.println(numbersConvertedToStar);

        System.out.println(convertedNow.equals(numbersConvertedToStar));

    }

}
