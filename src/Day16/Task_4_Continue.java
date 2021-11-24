package Day16;

import java.util.Scanner;

public class Task_4_Continue {

    // get text from the user, print each letter in a new line
    // skip space or semi-column characters


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();

        char letter;

        for (int i = 0; i < userInput.length(); i++) {
            letter = userInput.charAt(i);

            if (letter == ' ' || letter == ';')
                continue;

            System.out.println(letter);
        }

    }

}
