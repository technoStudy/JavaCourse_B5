package Day26._02_FinalReference;

import java.util.Arrays;

public class _02_FinalWithReferenceType {

    public static void main(String[] args) {

        // When we declare an array as final the size of the array is final we cannot instantiate again - but we can update values
        final String[] MONTHS = {"January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November", "December"};

        System.out.println(Arrays.toString(MONTHS));

        MONTHS[3] = "Hi"; // this is updating the value in an array and since the values in array is not final we can do this

        System.out.println(Arrays.toString(MONTHS));

//        MONTHS = new String[6]; - not available because the array is final
    }

}
