package Day11;

import java.util.Scanner;

public class TASK2 {

    // get an int from user
    // if it is greater than 100, print "PASSED"

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number please: ");
        int userNumber = scanner.nextInt();

        if (userNumber > 100){
            System.out.println("PASSED");
        }

    }

}
