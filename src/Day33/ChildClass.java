package Day33;

public class ChildClass extends AbstractClass {

    // Child class has to implement abstract methods from parent class

    @Override
    public void abstractMethod() {
        System.out.println("Child class overriden abstract method!");
    }

}
