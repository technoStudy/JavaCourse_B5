package Day3.PrimitiveTypes;

public class ByteDataType {

    public static void main(String[] args) {

//      int age = 30; -  we don't have to use to store someone's age
        byte age = 30;

        byte myFirstByte = 54;
        byte mySecondByte = -20;
        System.out.println(myFirstByte);
        System.out.println(mySecondByte);

        byte maxValue = 127; // if you pt 128, it will make the byte out of range
        byte minValue = -128;

        System.out.println(maxValue);
        System.out.println(minValue);

    }

}
