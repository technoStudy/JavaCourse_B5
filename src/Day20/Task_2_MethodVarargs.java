package Day20;

public class Task_2_MethodVarargs {

    // Create a multiply method with double varargs (return double)

    public static void main(String[] args) {
        System.out.println(multiply(5.6, 7.2, 3.3, 8.1));
    }


    public static double multiply(double... numbers) {
        int product = 1;
        for (int i = 0; i < numbers.length; i++)
            product *= numbers[i];

        return product;
    }

}
