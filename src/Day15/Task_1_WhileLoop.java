package Day15;

import java.util.Scanner;

public class Task_1_WhileLoop {

    // Get an int from user
    // sum all the numbers from 1 to userInput (use while loop)

    // ex: userInput = 5;
    // 1 + 2 + 3 + 4 + 5;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();

        int sum = 0;

        int counter = 1;
        while (counter <= limit) {
            sum += counter;
            counter++;
        }

        System.out.println(sum);

    }

}
