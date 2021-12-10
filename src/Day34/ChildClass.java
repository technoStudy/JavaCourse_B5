package Day34;

public class ChildClass implements ParentInterface {

    /**

        -If a class needs to inherit from an interface,
            should use "implements" keyword!

        -If a class inherits from Interface, it should override all the methods!

     */

    @Override
    public void method1() {
        System.out.println("Method1");
    }

    @Override
    public void method2() {
        System.out.println("Method2");
    }

}
