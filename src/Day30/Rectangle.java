package Day30;

public class Rectangle extends Shape{

    int length;
    int width;

    public Rectangle(int length, int width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
        super.area = length * width;
        super.perimeter = 2 * (length + width);
    }

}
