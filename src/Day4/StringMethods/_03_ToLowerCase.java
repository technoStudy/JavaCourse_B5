package Day4.StringMethods;

public class _03_ToLowerCase {

    public static void main(String[] args) {

        // Strings are immutable
        // Which means once you create a String you cannot change it

        String countryName = "United States Of AMERICA";

        // This is not going to update our string it will return a new string
        System.out.println(countryName.toLowerCase());       

        System.out.println(countryName);

    }
}
