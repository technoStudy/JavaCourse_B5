package Day30.ShapePackage;

public class Square extends Rectangle {


    public Square(int side) {
        super(side, side);
        super.area = side * side;
        super.perimeter = 4 * side;
        super.name = "Square: is a special rectangle!";
    }

}
