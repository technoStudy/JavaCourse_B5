package Day5.StringMethods;

public class _09_IsEmpty {


    public static void main(String[] args) {

        String name = "Halit";
        System.out.println(name.isEmpty()); // returns boolean

        String emptyString = "";
        System.out.println(emptyString.isEmpty());

        String space = " "; // space is a character so you'll get false when you use isEmpty method
        boolean isSpaceEmpty = space.isEmpty();
        System.out.println(isSpaceEmpty);

    }

}
