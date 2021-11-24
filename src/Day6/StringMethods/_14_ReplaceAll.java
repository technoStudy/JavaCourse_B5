package Day6.StringMethods;

public class _14_ReplaceAll {

    public static void main(String[] args) {

        // difference between replace and replaceAll
        // replace accepts chars or Strings
        // replaceAll accepts regex(regular expression) - range of characters

        String phoneNumber = "My number is 01238723456890";

        String replacedNumber = phoneNumber.replaceAll("[3-6]", "#");
        System.out.println(replacedNumber);

        String replacedNumber2 = phoneNumber.replaceAll("[0-9]", "-");
        System.out.println(replacedNumber2);

        System.out.println(phoneNumber.replaceAll("[a-z]", "+"));

        System.out.println(phoneNumber.replaceAll("[A-z]", "|"));
        
    }

}
