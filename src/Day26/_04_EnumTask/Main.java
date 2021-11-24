package Day26._04_EnumTask;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine().toUpperCase();

        Months userMonth = Months.valueOf(userInput); // with value of method we can call a constant using a string

        switch (userMonth) {

            case JANUARY:
                System.out.println("It is winter break!");
                break;
            case APRIL:
                System.out.println("I just finish SDET course");
                break;
            case OCTOBER:
                System.out.println("I got my first SDET job and I'm working in a great company");
                break;
            default:
                System.out.println("I'm learning Java! Please do not disturb!!!!");
        }

    }

}
