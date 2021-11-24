package Day12;

import java.util.Scanner;

public class Task2 {

    // get string input from the user
    // if it contains 'a' and 'b', print "The input contains both a and b"
    // if input only contains a print "The input contains a"
    // if input only contains b print "The input contains b"
    // else print "The input does not contains both a and b"

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String userInput = scanner.nextLine().toLowerCase();

        if (userInput.contains("a") && userInput.contains("b")){ // use specific condition first
            System.out.println("User input contains both 'a' and 'b'");
        }else if (userInput.contains("a")){
            System.out.println("User input contains only 'a'");
        }else if (userInput.contains("b")){
            System.out.println("User input contains only 'b'");
        }else{
            System.out.println("User input does not contain both 'a' and 'b'");
        }
    }

}
