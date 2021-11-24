package Day4.StringMethods;

public class _01_StartsWith {

    public static void main(String[] args) {

        String message = "Hello World!!";

        System.out.println(message);

        boolean isMessageStartsWithHello = message.startsWith("Hello");
        System.out.println("Is the message Starts with Hello: " + isMessageStartsWithHello);

        boolean isSecondWordStartsWithW = message.startsWith("W", 6);
        System.out.println("Is second word in message Starts with W: " + isSecondWordStartsWithW);

    }

}
