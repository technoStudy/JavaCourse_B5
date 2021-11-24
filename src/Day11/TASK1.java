package Day11;

import java.util.Scanner;

public class TASK1 {

    // get string input from the user
    // check if it contains 'a' and 'b'
    // check if it contains 'a' or 'c'
    // check if it does NOT contain 'c'
    // check if it does not contain both 'c' and 'd'


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        boolean containsAAndB = userInput.contains("a") && userInput.contains("b");
        boolean containsAORC = userInput.contains("a") || userInput.contains("c");
        boolean notContainC = !userInput.contains("c");
        boolean notContainCAndD = !userInput.contains("c") && !userInput.contains("d");

        System.out.println(containsAAndB);
        System.out.println(containsAORC);
        System.out.println(notContainC);
        System.out.println(notContainCAndD);


    }

}
