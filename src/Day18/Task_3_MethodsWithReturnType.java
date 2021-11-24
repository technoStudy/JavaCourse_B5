package Day18;

public class Task_3_MethodsWithReturnType {

    // create a method that takes two numbers and returns their product

    public static void main(String[] args) {
        System.out.println(multiplyTwoNumbers(10, 34));
        System.out.println(multiplyTwoNumbers(9, 6));
    }



    public static int multiplyTwoNumbers(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }

}
