package Day9.TypeCasting;

public class Task2 {

    // create a float and convert it to an integer
    // create a double and convert it to a float
    // create a long and convert it to byte


    public static void main(String[] args) {

        float myFloat = 10.5F;
        int myInt = (int) myFloat;
        System.out.println(myInt);

        double myDouble = 46.98;
        float myFloat2 = (float) myDouble;
        System.out.println(myFloat2);

        long myLong = 35L;
        byte myByte = (byte) myLong;
        System.out.println(myByte);

    }

}
