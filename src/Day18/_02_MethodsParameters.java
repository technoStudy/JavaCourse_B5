package Day18;

public class _02_MethodsParameters {

    public static void main(String[] args) {
        greetUser("Altyn"); // the value we provide for the method parameter is called argument
        greetUser("Amsal");
        greetUser("Gamze");
    }



    // (String name) -> is parameter in the method signature
    public static void greetUser(String name){
        System.out.println("Hello " + name);
    }

}
