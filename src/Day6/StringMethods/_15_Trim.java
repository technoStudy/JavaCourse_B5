package Day6.StringMethods;

public class _15_Trim {

    public static void main(String[] args) {

        String myString = "            Hello          World         ";

        System.out.println(myString); // it's not going to touch spaces between words

        // trim method will remove spaces before and after your String
        System.out.println(myString.trim());

    }

}
