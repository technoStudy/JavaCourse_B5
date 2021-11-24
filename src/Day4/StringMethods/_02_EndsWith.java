package Day4.StringMethods;

public class _02_EndsWith {

    public static void main(String[] args) {

        String message = "Hello World!!";

        boolean isMessageEndsWithWorld = message.endsWith("!"); // case sensitive

        System.out.println(isMessageEndsWithWorld);
        System.out.println(message.endsWith("!!"));

    }

}
