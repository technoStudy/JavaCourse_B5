package Day15;

import java.util.Scanner;

public class Task_5_LoginWithDoWhile {

    public static void main(String[] args) {

        int correctPin = 8787;

        Scanner scanner = new Scanner(System.in);
        int pinNumber;

       do {
           System.out.print("Please enter pin number: ");
           pinNumber = scanner.nextInt();
       } while (pinNumber != correctPin);

        System.out.println("You're logged in!");

    }

}
