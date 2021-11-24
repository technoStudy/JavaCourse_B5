package Day22.RectanglePackage;

public class Rectangle {

    int length;
    int width;


    public int perimeter() {
        return (length + width) * 2;
    }

    public int area() {
        return (length * width);
    }

}
