package Day33;

public class Demo {

    public static void main(String[] args) {

        // Abstract class cannot be instantiated!!!
        // AbstractClass ab = new AbstractClass();

        ChildClass childClass = new ChildClass();
        childClass.abstractMethod();

    }

}
