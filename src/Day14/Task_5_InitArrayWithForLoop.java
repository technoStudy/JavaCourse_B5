package Day14;

import java.util.Arrays;

public class Task_5_InitArrayWithForLoop {

    // declare an array of bytes
    // initialize it with size 3
    // give each element a random value (use random method)
    // print all elements

    public static void main(String[] args) {

        byte[] byteArray = new byte[3];

//        WHEN YOU SEE REPEAT LIKE THIS ALWAYS THINK ABOUT LOOP!!!

        // byteArray[0] = (byte) (Math.random() * 127);
        // byteArray[1] = (byte) (Math.random() * 127);
        // byteArray[2] = (byte) (Math.random() * 127);

        // initializing array with random values
        for (int i = 0; i < byteArray.length; i++) {
            byteArray[i] = (byte) (Math.random() * 127);
        }

        // print array
        for (int i = 0; i < byteArray.length; i++) {
            System.out.println(byteArray[i]);
        }

    }

}
