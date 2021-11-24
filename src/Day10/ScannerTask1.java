package Day10;

import java.util.Scanner;

public class ScannerTask1 {

    // get 2 integers from user
    // sum these integers and print the result

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter a number: ");
        int number2 = scanner.nextInt();

        int sum = number1 + number2;

        System.out.println(sum);

    }

}
