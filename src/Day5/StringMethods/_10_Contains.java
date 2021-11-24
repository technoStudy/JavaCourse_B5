package Day5.StringMethods;

public class _10_Contains {

    public static void main(String[] args) {

        String hello = "Hello World";

        boolean containsH = hello.contains("H"); // case sensitive
        boolean containsWorld = hello.contains("World");
        boolean containsSpace = hello.contains(" ");
        boolean containsZ = hello.contains("Z");

        System.out.println("String contains \"H\": " + containsH);
        System.out.println("String contains \"World\": " + containsWorld);
        System.out.println("String contains \"Space\": " + containsSpace);
        System.out.println("String contains \"Z\": " + containsZ);

    }

}
