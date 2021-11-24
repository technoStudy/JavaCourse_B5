package Day16;

import java.util.Scanner;

public class _02_BreakKeyword {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userInput;

        while (true) {
            System.out.print("Enter input: ");
            userInput = scanner.nextLine().toLowerCase();

            if (userInput.equals("stop")) {
                break; // it will quit the loop
            }
        }


        for (int i = 0; i < 10; i++) {
            System.out.println(i);

            if (i == 5) // since if condition is after print - we'll get 5 in the terminal
                break;
        }
    }

}
