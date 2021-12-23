package Day42;

public class _01_WhatAreExceptions {

    public static void main(String[] args) {

        sayHello(null);

    }

    public static void sayHello(String name) {
        System.out.println("Hello " + name.toUpperCase());
    }

}
