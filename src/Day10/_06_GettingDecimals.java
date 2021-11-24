package Day10;

import java.util.Scanner;

public class _06_GettingDecimals {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter some float: ");
        float myFloat = scanner.nextFloat();

        System.out.print("Enter some double: ");
        double myDouble = scanner.nextDouble();

        System.out.println("Float: " + myFloat);
        System.out.println("Double: " + myDouble);

    }

}
