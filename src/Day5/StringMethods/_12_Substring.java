package Day5.StringMethods;

public class _12_Substring {

    public static void main(String[] args) {

        String message = "IntelliJ is cool!";

        // to create a substring starting from 9th index
        String substring = message.substring(9);
        System.out.println(substring);

        String substring2 = message.substring(0,8); // index 0 to index 8 (8 is not included)
        System.out.println(substring2);

    }

}
