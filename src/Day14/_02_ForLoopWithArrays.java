package Day14;

import java.util.Arrays;

public class _02_ForLoopWithArrays {

    public static void main(String[] args) {

        int[] array = {21, 43, 65, 86, 22, 41, 55, 99};

        System.out.println(Arrays.toString(array));

//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[4]);
//        System.out.println(array[5]);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

}
