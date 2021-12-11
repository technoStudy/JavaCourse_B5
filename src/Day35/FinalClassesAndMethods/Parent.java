package Day35.FinalClassesAndMethods;

public class Parent {

    public void testMethod() {
        System.out.println("Test");
    }

    /** Final methods cannot be overridden */
    public final void finalMethod() {
        System.out.println("Final Method");
    }

}
