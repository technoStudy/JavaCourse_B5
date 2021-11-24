package Day9.TypeCasting;

public class Task1 {

    //  Create 2 variables short & long | convert short to long | print long
    //  Create 2 variables float & double | convert float to double | print double
    //  Create 2 variables byte & float | convert byte to float | print float


    public static void main(String[] args) {

        short shortNumber = 28;
        long longNumber = shortNumber;
        System.out.println(longNumber);

        float floatNumber = 3.5F;
        double doubleNumber = floatNumber;
        System.out.println(doubleNumber);

        byte byteNumber = 9;
        float floatNumber2 = byteNumber;
        System.out.println(floatNumber2);

    }

}
