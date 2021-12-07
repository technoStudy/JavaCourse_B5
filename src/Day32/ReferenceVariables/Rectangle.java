package Day32.ReferenceVariables;

public class Rectangle extends Shape {

    @Override
    String getShapeName() {
        return "Rectangle";
    }

    @Override
    void printShapeName() {
        System.out.println("Rectangle");
    }

    int getLength() {
        return 5;
    }

}
