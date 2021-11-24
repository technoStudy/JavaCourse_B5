package Day13;

import java.util.Scanner;

public class Task3_NestedIf {

    // get a number from user
    // if the number is larger than zero, get another number from user,
    // if second number is larger than 5 print "ok" else print "not ok"
    // if first number is less than or equal to zero, print "too cold to check"

    // think of the first number as temperature
    // second number is atmospheric pressure
    // and your code is doing diagnostics

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter temperature: ");
        int temperature = scanner.nextInt();

        if (temperature > 0) {
            System.out.print("Please enter atmospheric pressure: ");
            int pressure = scanner.nextInt();

            if (pressure > 5) {
                System.out.println("OK");
            } else {
                System.out.println("Not OK");
            }

        } else {
            System.out.println("Too cold to check!");
        }



    }

}
