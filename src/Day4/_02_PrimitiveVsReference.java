package Day4;

import java.awt.*;

public class _02_PrimitiveVsReference {


    public static void main(String[] args) {

        byte x = 1;
        byte y = x; // primitive types copied by their values

        System.out.println("Byte x before updating: " + x);
        System.out.println("Byte y before updating x: " + y);

        x = 2;

        System.out.println("Byte x after updating: " + x);
        System.out.println("Byte y after updating x: " + y);


        Point point1 = new Point(1,1);
        Point point2 = point1; // Reference types are copied by their references

        System.out.println("Point 1 before updating: " + point1);
        System.out.println("Point 2 before updating Point1: " + point2);

        point1.x = 3;

        System.out.println("Point 1 after updating: " + point1);
        System.out.println("Point 2 after updating Point1: " + point2);

        point2.x = 5; // point 1 and point 2 are holding reference values
                      // for the same data so it will affect both of them

        System.out.println(point1);

    }

}
