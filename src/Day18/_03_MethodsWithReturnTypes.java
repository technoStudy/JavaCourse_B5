package Day18;

public class _03_MethodsWithReturnTypes {

    public static void main(String[] args) {
        String greetMessage = greet();
        System.out.println(greetMessage);
    }


    public static String/*Return Type*/ greet() {
        String greet = "Hello";
        return greet;
    }

}
