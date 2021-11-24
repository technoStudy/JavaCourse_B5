package Day27_Terminal;

import java.util.Scanner;

public class PrintMessage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a message: ");

        String userMessage = scanner.nextLine();

        System.out.println("User Message: " + userMessage);

    }

}
