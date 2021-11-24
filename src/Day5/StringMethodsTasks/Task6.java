package Day5.StringMethodsTasks;

public class Task6 {

    // Part1: find out the character at 5th index of String "123456789"
    // Part2: find out the character at 5th index of String "0123456789"

    public static void main(String[] args) {

        String numbers1 = "123456789";
        String numbers2 = "0123456789";

        char char1 = numbers1.charAt(5);
        char char2 = numbers2.charAt(5);

        System.out.println("Char at fifth index for numbers1: " + char1);
        System.out.println("Char at fifth index for numbers2: " + char2);

    }

}
