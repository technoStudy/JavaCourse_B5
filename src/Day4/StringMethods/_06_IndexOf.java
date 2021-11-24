package Day4.StringMethods;

public class _06_IndexOf {

    public static void main(String[] args) {

        // indexOf method starts to count from 0

        String welcomeMessage = "Welcome to TechnoStudy!";

        int indexOfS = welcomeMessage.indexOf('S'); // case sensitive

        System.out.println(indexOfS);

        int indexOfW = welcomeMessage.indexOf('W');

        System.out.println(indexOfW);

        System.out.println(welcomeMessage.indexOf('o', 10));

    }

}
