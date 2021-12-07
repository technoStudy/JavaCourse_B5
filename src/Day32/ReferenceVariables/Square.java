package Day32.ReferenceVariables;

public class Square extends Rectangle {

    @Override
    String getShapeName() {
        return "Square";
    }

    @Override
    void printShapeName() {
        System.out.println("Square");
    }

    int getSide() {
        return 7;
    }

}
