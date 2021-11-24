package Day9.TypeCasting;

public class ExplicitCasting {

    public static void main(String[] args) {

        // Explicit Casting (Narrowing Casting) - Manually

        long myLong = 3984742L;
        int myInt = (int) myLong;
        System.out.println(myInt);

        int myInteger = 555;
        short myShort = (short) myInteger;
        System.out.println(myShort);

        short myShort2 = 28;
        byte myByte = (byte) myShort2;
        System.out.println(myByte);
        
        double myDouble = 3.7;
        byte myByte2 = (byte) myDouble;
        System.out.println(myByte2);


        double a = 1.5;
        int b = (int) a + 5;
        System.out.println(b);
        

    }

}
