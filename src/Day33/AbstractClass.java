package Day33;

public abstract class AbstractClass {

    /**
     *      ABSTRACT KEYWORD
     *          1- Abstract classes cannot be used to create objects!
     *          2- Abstract classes can have both abstract and non-abstract methods!
     *          3- Abstract methods don't have body but will require when inherited!
     */

    public void nonAbstractMethod() {
        System.out.println("Non-Abstract Method");
    }

    // Abstract methods don't have body!
    public abstract void abstractMethod();

}
