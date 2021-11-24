package Day12;

import java.util.Scanner;

public class Task4 {

    // Get 2 numbers from user as a String
    // Convert this numbers to int
    // Sum two integers

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number -> ");
        String firstNumber = scanner.nextLine();

        System.out.print("Please enter a number -> ");
        String secondNumber = scanner.nextLine();

        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);

        System.out.println("Sum: " + (number1 + number2));

    }

}
