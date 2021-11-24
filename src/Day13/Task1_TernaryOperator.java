package Day13;

import java.util.Scanner;

public class Task1_TernaryOperator {

    public static void main(String[] args) {

        // if temperature is less than 15 set message to "Cold Weather" otherwise set it to "Good Weather"
        // USE TERNARY OPERATOR
        // get temperature from user

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        int temperature = scanner.nextInt();

        String message = temperature < 15 ? "Cold Weather" : "Good Weather";

        System.out.println(message);

    }

}
