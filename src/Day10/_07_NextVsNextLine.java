package Day10;

import java.util.Scanner;

public class _07_NextVsNextLine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine().trim(); // can use trim() method to remove spaces
        // next() only can read the first word
        // nextLine() can read the whole line

        System.out.println("Your name: " + name);

    }

}
