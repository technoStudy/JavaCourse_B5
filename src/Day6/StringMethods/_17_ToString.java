package Day6.StringMethods;

import java.awt.*;

public class _17_ToString {

    public static void main(String[] args) {

        Point point = new Point(1,1);
        System.out.println("This is point object: " + point);
        String pointString = point.toString(); // cannot use String methods before converting to a String
        System.out.println("This is point object converted to String: " + pointString);

        System.out.println(pointString.isEmpty());
        System.out.println(pointString.contains("x=1,y=1"));

    }

}
