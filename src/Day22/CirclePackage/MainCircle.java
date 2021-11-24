package Day22.CirclePackage;

public class MainCircle {

    public static void main(String[] args) {

        Circle circle1 = new Circle();
        circle1.radius = 5;
//        circle1.PI = 2; - PI field is already initialized and it's a constant so we cannot update it

        System.out.println(circle1.circleArea());
        System.out.println(circle1.circlePerimeter());


        Circle circle2 = new Circle();
        circle2.radius = 100;

        System.out.println(circle2.circleArea());
        System.out.println(circle2.circlePerimeter());

    }

}
