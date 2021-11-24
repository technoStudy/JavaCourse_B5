package Day12;

import java.util.Scanner;

public class Task1 {

    // Get a number from user as int
    // Check if the number is bigger than 100
    // If it is bigger than 100 print "It's bigger than 100"
    // else print "Number is less than or equal to 100"

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        if (number > 100) {
            System.out.println("The number is bigger than 100!");
        } else {
            System.out.println("The number is less than or equal to 100!");
        }

    }

}
