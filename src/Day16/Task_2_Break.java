package Day16;

import java.util.Scanner;

public class Task_2_Break {

    // get a string from the user
    // using for-loop print each letter in a new line
    // part2: stop if you encounter space character (You should not print space)

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        char letter;

        for (int i = 0; i < userInput.length(); i++) {
            letter = userInput.charAt(i);

            if (letter == ' ')
                break;

            System.out.println(letter);
        }

    }

}
