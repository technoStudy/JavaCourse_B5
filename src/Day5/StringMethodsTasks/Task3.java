package Day5.StringMethodsTasks;

public class Task3 {

    // String hello = "Hi world,Hello world";
    // check string "Hi world,Hello world" starts with "Hi"

    // part2: "Hi world,Hello world" check whether
    // second part of the string starts with Hello (after comma)


    public static void main(String[] args) {

        String hello = "Hi world,Hello world";

        boolean startsWithHi = hello.startsWith("Hi");
        System.out.println(startsWithHi);

        boolean secondPartStartsWithHello = hello.startsWith("Hello", 9);
        System.out.println(secondPartStartsWithHello);

        // first finding index of comma
        int indexOfComma = hello.indexOf(',');

        // for toOffset we're saying indexOfComma + 1 - because we want to start after comma
        boolean secondPartStartsWithHello2 = hello.startsWith("Hello", indexOfComma+1);
        System.out.println(secondPartStartsWithHello2);

    }

}
