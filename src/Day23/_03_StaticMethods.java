package Day23;

public class _03_StaticMethods {

    int nonStatic = 10;
    static int staticNumber = 15;

    public static void staticMethod() {
        System.out.println("This is a static method!");
//        nonStaticMethod(); - this will give an error, because we cannot access non-static methods from static methods without object
         staticMethod2(); // Able to access because this is a static method
//         System.out.println(nonStatic); - this will give error, because we cannot access non-static fields without creating objects
        System.out.println(staticNumber); // able to access
    }

    public static void staticMethod2() {
        System.out.println("This is a static method!");
    }

    public void nonStaticMethod() {
        System.out.println("This is a non-static method!");
        staticMethod2(); // static method available
        nonStaticMethod2(); // non-static method is available
        System.out.println(staticNumber); // static variable is accessible
        System.out.println(nonStatic); // non-static variable accessible
    }

    public void nonStaticMethod2() {
        System.out.println("This is a non-static method!");
    }
}
