package Day16;

import java.util.Scanner;

public class Task_3_Continue {

    // get number from the user, print all the numbers from 0 to the number from user
    // skip even numbers using continue

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();

        for (int i = 0; i <= limit; i++) {
            if (i % 2 == 0)
                continue;

            System.out.println(i);
        }

    }

}
