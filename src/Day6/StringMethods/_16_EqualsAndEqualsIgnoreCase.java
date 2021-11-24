package Day6.StringMethods;

public class _16_EqualsAndEqualsIgnoreCase {

    public static void main(String[] args) {

        String string1 = "TechnoStudy";
        String string2 = "TechnoStudy";
        String string3 = "TECHNOSTUDY";

        System.out.println("is String1 equal to String2: " + string1.equals(string2));

        System.out.println("is String1 equal to String3: " + string1.equals(string3));


        System.out.println("is String1 equalsIgnoreCase to String3: " + string1.equalsIgnoreCase(string3));

    }

}
