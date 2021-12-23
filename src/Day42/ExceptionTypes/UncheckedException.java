package Day42.ExceptionTypes;

public class UncheckedException {

    public static void main(String[] args) {

        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(intArray[5]);
        System.out.println(intArray[0]);

        // Unchecked Exception appears at Runtime!!
        // System.out.println(intArray[20]); // no compiler error

        try {
            System.out.println(intArray[25]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("There is no such index!");
        }

    }

}
