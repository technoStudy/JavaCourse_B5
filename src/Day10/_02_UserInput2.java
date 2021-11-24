package Day10;

import java.util.Scanner;

public class _02_UserInput2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? -> ");
        String name = scanner.nextLine();

        System.out.print("What is your age? -> ");
        String age = scanner.nextLine();

        System.out.println("Your name: " + name);
        System.out.println("Your age: " + age);

    }

}
