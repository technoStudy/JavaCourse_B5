package Day10.MathClassPack;

public class MathClass {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = -3;

        System.out.println(Math.abs(c)); // convert negative number to positive (returns absolute value)

        System.out.println(Math.max(a, b)); // compare two variables and return the greatest value
        System.out.println(Math.min(a, b)); // compare two variables and return the minimum value


        // round: round direction is automatic - nearest
        System.out.println(Math.round(3.4)); // returns int
        System.out.println(Math.round(3.5));
        System.out.println(Math.round(3.6));


        // ceil: round direction is always up
        System.out.println((int) Math.ceil(7.01)); // returns double
        System.out.println(Math.ceil(7.3));
        System.out.println(Math.ceil(7.9));


        // floor: round direction is always down
        System.out.println((int) Math.floor(5.9)); // returns double
        System.out.println(Math.floor(5.1));
        System.out.println(Math.floor(5.999));


        System.out.println((int) Math.sqrt(16)); // returns double
        System.out.println(Math.pow(3, 4));


        System.out.println("Random double between 0 and 1: " + Math.random()); // return random double between 0 - 1
//        0<------------->1
        System.out.println(Math.random() * 100);
//        0<------------->100
        System.out.println((int) (Math.random() * 100));


    }

}
