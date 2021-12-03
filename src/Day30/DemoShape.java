package Day30;

public class DemoShape {

    public static void main(String[] args) {

        Circle circle1 = new Circle(3.5);
        System.out.println(circle1.name);
        System.out.println(circle1.radius);
        System.out.println(circle1.area);
        System.out.println(circle1.perimeter);

        circle1.name = "Special Circle";
        System.out.println(circle1.name);



        Rectangle rectangle1 = new Rectangle(7,9);
        System.out.println(rectangle1.name);
        System.out.println(rectangle1.length);
        System.out.println(rectangle1.width);
        System.out.println(rectangle1.area);
        System.out.println(rectangle1.perimeter);


        Square square1 = new Square(5);
        System.out.println(square1.length);
        System.out.println(square1.width);
        System.out.println(square1.name);

    }

}
