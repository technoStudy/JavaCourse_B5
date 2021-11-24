package Day5.StringMethodsTasks;

public class Task1 {

    /*
                    TASK
    Part1: find out the length of String "123456789"
    Part2: find out the length of String "0123456789"

     */


    public static void main(String[] args) {

        // Part 1
        String firstNumber = "123456789";

        int lengthOfFirstNumberString = firstNumber.length();

        System.out.println("Length of first string: " + lengthOfFirstNumberString);


        // Part 2
        String secondNumber = "0123456789";

        int lengthOfSecondNumberString = secondNumber.length();

        System.out.println("Length of second string: " + lengthOfSecondNumberString);

    }

}
