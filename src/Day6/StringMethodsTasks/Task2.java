package Day6.StringMethodsTasks;

public class Task2 {

    // create a string -> string = "Hello Techno Study!"
    // print the last word from string (Study)

    public static void main(String[] args) {

        String hello = "Hello Techno Study!";

        String subStudy2 = hello.substring(13); // -> Study!

        String subStudy = hello.substring(13, 18);

        System.out.println(subStudy);
        System.out.println(subStudy2);

    }

}
