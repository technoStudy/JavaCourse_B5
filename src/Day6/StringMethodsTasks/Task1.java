package Day6.StringMethodsTasks;

public class Task1 {

    // Create 2 Strings -> string1 = "01234" and string2 = "56789"
    // Part1: concatenate string1 and string2 with concat() function
    // Part2: concatenate string1 and string2 using + operator
    // Print them out

    public static void main(String[] args) {

        String string1 = "01234";
        String string2 = "56789";

        String contactWithMethod = string1.concat(string2);
        String concatWithPlus = string1 + string2;

        System.out.println(contactWithMethod);
        System.out.println(concatWithPlus);

    }

}
