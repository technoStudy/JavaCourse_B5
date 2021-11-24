package Day9.TypeCasting;

public class ImplicitCasting {

    public static void main(String[] args) {

        // Implicit Casting (Widening Casting) - Automatically
        // byte > short > int > long > float > double

        byte byteNumber = 50;
        short shortNumber = byteNumber;
        System.out.println(shortNumber);

        short shortNumber2 = 400;
        int integerNumber = shortNumber2;
        System.out.println(integerNumber);

        int integerNumber2 = 2000000;
        long longNumber = integerNumber2;
        System.out.println(longNumber);


        float floatNumber = 1.354F;
        double doubleNumber = floatNumber;
        System.out.println(doubleNumber);


        short shortNumber3 = 250;
        float floatNumber2 = shortNumber3;
        System.out.println(floatNumber2);


        double doubleNumber2 = 5; // java will automatically coverts 5 into a double

//         int b = doubleNumber2 + 4; // java converts 4 into a double
//        int b = 1.5 + 3.4;

        double a = 2.1;
        double b = a + 5;

        System.out.println(b);

    }

}
