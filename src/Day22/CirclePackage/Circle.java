package Day22.CirclePackage;

public class Circle {

    final double PI = 3.14;
    double radius;

    public double circlePerimeter() {
        return (2 * radius * PI);
    }

    public double circleArea() {
        return (PI * (Math.pow(radius, 2)));
    }

}
