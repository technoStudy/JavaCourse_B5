package Day8.ArithmeticExpressions;

public class _02_Subtraction {

    public static void main(String[] args) {

        // Subtraction only using values
        System.out.println(5 - 3);

        // Subtraction using only variables
        int x = 55;
        int y = 33;

        System.out.println(x - y);

        int result = x - y;
        System.out.println(result);

        // Subtraction using variable and value
        System.out.println(result - 5);

        // put "-" in the beginning of a variable, you'll get negative value
        System.out.println(-result);

        // java will convert ints to strings
        System.out.println("result: " + x + y); // math will not happen here

    }

}
