package Day12;

public class _04_PrimitiveToString {

    public static void main(String[] args) {

        int x = 1;
        int y = 2;

        byte z = 5;

        System.out.println(x + y);


        // Wrapper Class
        String xConvertedToString = Integer.toString(x);
        String yConvertedToString = Integer.toString(y);

        System.out.println(xConvertedToString + yConvertedToString);

        String zConvertedToString = Byte.toString(z);

        System.out.println(xConvertedToString + zConvertedToString);

    }

}
