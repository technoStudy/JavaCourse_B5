package Day15;

import java.util.Scanner;

public class Task_4_Login {

    // ask the user for pin number
    // if the pin number is incorrect keep asking the user for pin number
    // when the pin is correct print out "you are logged in"
    // the correct pin is 8787

    public static void main(String[] args) {

        int correctPin = 8787;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter pin number: ");
        int pinNumber = scanner.nextInt();

        while (pinNumber != correctPin) {
            System.out.print("Your input is invalid, please try again: ");
            pinNumber = scanner.nextInt();
        }

        System.out.println("You're logged in!");

    }

}
