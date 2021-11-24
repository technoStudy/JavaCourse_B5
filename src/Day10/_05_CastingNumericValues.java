package Day10;

import java.util.Scanner;

public class _05_CastingNumericValues {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your int: ");
        int userInput = (int) scanner.nextLong();

        System.out.println("MyInt: " + userInput);

    }

}
