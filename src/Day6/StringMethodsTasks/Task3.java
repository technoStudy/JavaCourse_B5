package Day6.StringMethodsTasks;

public class Task3 {

    // create a string -> string = "Hello Techno Study!"
    // part1: check if the String is empty or not
    // part2: check if the String contains " " (space)

    public static void main(String[] args) {

        String hello = "Hello Techno Study!";

        boolean isStringEmpty = hello.isEmpty();
        boolean isStringContainsSpace = hello.contains(" ");

        System.out.println("String is empty: " + isStringEmpty);
        System.out.println("String contains space: " + isStringContainsSpace);

    }

}
