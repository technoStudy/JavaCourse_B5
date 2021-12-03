package Day30.WhatCanBeExtended;

public class Child extends Parent {

    /**
     * All the methods and fields are accessible from child class (unless it's private)
     */

    public void instanceMethod() {
//        System.out.println(privateVariable); - cannot extend private fields
        System.out.println(defaultVariable);
        System.out.println(protectedVariable);
        System.out.println(publicVariable);

        System.out.println(staticVariable); // static fields are accessible when you extend (unless it's private)

        System.out.println(finalVariable); // final fields are accessible when you extend (unless it's private)
    }

    public static void staticMethod() {

        /**
         * STATIC METHODS:
         *  CAN ONLY ACCESS STATIC VARIABLES AND METHODS
         *  CANNOT ACCESS INSTANCE FIELDS AND METHODS
         */

//        System.out.println(privateVariable);
//        System.out.println(defaultVariable);
//        System.out.println(protectedVariable);
//        System.out.println(publicVariable);

        System.out.println(staticVariable);

//        System.out.println(finalVariable);
    }

}
