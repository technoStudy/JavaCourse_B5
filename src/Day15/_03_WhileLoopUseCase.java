package Day15;

import java.util.Scanner;

public class _03_WhileLoopUseCase {

    public static void main(String[] args) {

        // get a string from user and print the string back
        // unless user types "quit", if user types quit then quit loop

        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        while (!userInput.equals("quit")) {
            System.out.print("Please enter input: ");
            userInput = scanner.nextLine().toLowerCase();

            if (userInput.equals("quit")) {
                break;
            } else {
                System.out.println(userInput);
            }
        }

    }

}
