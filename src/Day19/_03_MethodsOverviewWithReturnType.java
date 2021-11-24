package Day19;

public class _03_MethodsOverviewWithReturnType {

    public static void main(String[] args) {

        int sum = sumThreeIntegers(10, 20, 30);
        System.out.println(sum);

    }

    // This method will accept 3 integers as parameters and return the sum of numbers
    public static int sumThreeIntegers(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        return sum;
    }


    // quick task: write a method which accepts 4 doubles and sums them and returns the result as integer
    public static int sumFourDoubles(double d1, double d2, double d3, double d4) {
        int sum = (int) (d1 + d2 + d3 + d4);
        return sum;
    }

}
