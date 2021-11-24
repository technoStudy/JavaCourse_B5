package Day7;

import java.util.Arrays;

public class Task1 {

    // declare an array of bytes
    // initialize it with size 3
    // give each element a random value
    // print all elements

    public static void main(String[] args) {

        byte[] arrayOfBytes = new byte[3];
        arrayOfBytes[0] = 5;
        arrayOfBytes[1] = 10;
        arrayOfBytes[2] = 1;

        System.out.println(Arrays.toString(arrayOfBytes));

    }

}
