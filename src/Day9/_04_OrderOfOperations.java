package Day9;

public class _04_OrderOfOperations {

    public static void main(String[] args) {

        System.out.println(5 + 3 * 4); // result -> 17
        System.out.println((5 + 3) * 4); // result -> 32


        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        System.out.println((num1 + num2 + num3) / 3); // calculates average
        System.out.println(num1 + num2 + num3 / 3); // wrong

    }

}
