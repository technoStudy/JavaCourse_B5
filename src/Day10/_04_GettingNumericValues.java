package Day10;

import java.util.Scanner;

public class _04_GettingNumericValues {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter some byte: ");
        byte byteValue = scanner.nextByte();

        System.out.print("Enter some short: ");
        short shortValue = scanner.nextShort();

        System.out.print("Enter some int: ");
        int intValue = scanner.nextInt();

        System.out.print("Enter some long: ");
        long longValue = scanner.nextLong();

        System.out.println("Byte: " + byteValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Int: " + intValue);
        System.out.println("Long: " + longValue);


    }

}
