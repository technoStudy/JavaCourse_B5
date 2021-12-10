package Day34;

public interface FirstInterface {

    /**
     *  "public" keyword is unnecessary, because all methods by default are public
     *  "abstract" keyword is unnecessary, because all methods by default are abstract
     *
     *  Variables in Interface are by default "public", "static" and "final"
     *
     *  All methods in interfaces are abstract!!!
     *
     *  When you inherit code from an interface you must override(implement) all methods!!!
     *
     */

    // public keyword is unnecessary
    public void method();

    // abstract keyword us unnecessary
    abstract void method2();

    void method3(); // -> public abstract void method3();


    // Variables in Interface are by default "public", "static" and "final"
    public int variable1  = 10;
    static double variable2 = 30;
    final boolean variable3 = false;

    char variable4 = 'T'; // -> public static final char variable4 = 'T';


    /**
     - Like abstract classes, Interfaces cannot be used to create objects!
     - Interface methods do not have body (body provided by the "implementing" class)
     - On implementation of an Interface all methods should be overridden!

     - An Interface cannot contain a constructor!
     - Interfaces cannot be declared as private or protected!

     */


}
