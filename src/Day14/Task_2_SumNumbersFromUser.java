package Day14;

import java.util.Scanner;

public class Task_2_SumNumbersFromUser {

    // get limit from user
    // write a java program which calculates the sum of numbers [0 to limit];
    // using for-loop

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the limit: ");
        int limit = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= limit; i++) {
            sum += i;
        }

        System.out.println(sum);

    }

}
