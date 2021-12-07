package Day32.ReferenceVariables;

public class DemoShape {

    public static void main(String[] args) {

        // Reference types can store its type or sub-types

        Square square = new Square();               // every square is a square
        Rectangle square1 = new Square();           // every square is a rectangle
        Shape square2 = new Square();               // every square is a shape
        Object square3 = new Square();              // every square is an object

         // Square shape = new Shape();   |   every shape is not a square!!!

        square.getShapeName(); // shape type - method (Grand-Parent)
        square.getLength(); // rectangle type - method (Parent)
        square.getSide(); // square type - method

        square2.getShapeName(); // able to access parent method
//        square2.getLength(); // cannot access child methods
//        square2.getSide(); // cannot access child methods

    }

}
