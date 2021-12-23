package Day42.Task;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println(number);
        } catch (NumberFormatException ex) {
            System.out.println("Your input is invalid!");
        }

    }

}
