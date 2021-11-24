package Day10;

import java.util.Scanner;

public class ScannerTask2 {

    // create a program that ask user for their name,
    // hometown, age, height, currentLocation
    // and if they like the place they live
    // print out this information

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? -> ");
        String name = scanner.nextLine();

        System.out.print("Where is your hometown? -> ");
        String hometown = scanner.nextLine();

        System.out.print("Where do you live? -> ");
        String placeTheyLive = scanner.nextLine();

        System.out.print("How old are you? -> ");
        byte age = scanner.nextByte();

        System.out.print("Height? -> ");
        short height = scanner.nextShort();

        System.out.print("You like " + placeTheyLive + "? -> ");
        boolean likePlaceTheyLive = scanner.nextBoolean();

        System.out.println("-------------------------");

        System.out.println("Name: " + name);
        System.out.println("Hometown: " + hometown);
        System.out.println("Place they live: " + placeTheyLive);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("You like where you live: " + likePlaceTheyLive);

        // if you use nextLine right after nextInt - nextLine will be skipped

    }

}
