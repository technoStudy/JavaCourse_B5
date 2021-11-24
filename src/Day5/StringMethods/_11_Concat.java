package Day5.StringMethods;

public class _11_Concat {

    public static void main(String[] args) {

        String first = "Hello ";
        String second = "TechnoStudy";
        String third = "!!!";

        String concattedString = first.concat(second);
        System.out.println(concattedString);

        String concattedString2 = concattedString.concat(third);
        System.out.println(concattedString2);

        // concat three strings to each other
        String concatAll = first.concat(second.concat(third));
        System.out.println(concatAll);

    }

}
