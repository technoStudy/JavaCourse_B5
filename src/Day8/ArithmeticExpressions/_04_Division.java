package Day8.ArithmeticExpressions;

public class _04_Division {

    public static void main(String[] args) {

        // Division using only values
        System.out.println(9 / 3);

        // Division using only variables
        int x = 45;
        int y = 5;

        System.out.println(x / y);

        int result = x / y;
        System.out.println(result);

        // Division using value and variable
        System.out.println(result / 3);

//        System.out.println(15 / 0); - not possible


        int a = 25; // 25.0
        int b = 4;  // 4.0

        double result2 = (double) a / (double) b; // converting int -> double
        System.out.println(result2);

    }

}
