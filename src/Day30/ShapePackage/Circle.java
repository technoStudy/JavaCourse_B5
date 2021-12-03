package Day30.ShapePackage;

public class Circle extends Shape {

    double radius;
    final double PI = 3.14;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
        super.area = PI * radius * radius;
        super.perimeter = 2 * PI * radius;
    }

}