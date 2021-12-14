package Day36;

import java.util.Arrays;

public class _01_WrapperClass {

    public static void main(String[] args) {

        // If we want our primitive type to act like non-primitive
        // we use "Wrapper Classes"

        int a = 5;  // Primitive types do not have any methods
                    // cannot have null values
                    // starts with lower-case

        String str = "TechnoStudy";  // Reference type have methods
                                     // can have null values
                                     // starts with upper-case


        int[] array1 = new int[3];
        System.out.println(Arrays.toString(array1)); // always has a value (if it's not assigned then 0)

        Integer[] array2 = new Integer[3];
        System.out.println(Arrays.toString(array2)); // can be null

    }

}
