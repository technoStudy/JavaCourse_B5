package Day18;

public class _02_MethodsParameters2 {

    public static void main(String[] args) {
        greetUser("James", "Lebron");
    }


    public static void greetUser(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }

}
