package Day43.ExceptionsRecap.Task2;

public class StaticMethodClass {

    public static void main(String[] args) {

        System.out.println(returnFirstLetter("Hey"));
        System.out.println(returnFirstLetter(""));
        System.out.println(returnFirstLetter(null));

    }



    public static char returnFirstLetter(String str) {

        char firstLetter = '0';

        try {
            firstLetter = str.charAt(0);
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println("You cannot use empty string! Returning 0!");
        } catch (NullPointerException ex) {
            System.out.println("You cannot use null value! Returning 0!");
        }

        return firstLetter;

    }

}
