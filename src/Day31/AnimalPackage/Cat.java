package Day31.AnimalPackage;

public class Cat extends Animal {

    /**
     *      - Overriding happens in multiple classes
     *      - To achieve overriding, classes should have parent-child relationship
     *      - When overriding:
     *          Method name and parameters should be same as the super method
     *
     *      *** Cannot override static methods - static methods belongs to classes
     */

    @Override // annotation
    public void eat() {
        System.out.println("Cat is catching a mouse");
        System.out.println("Cat is eating the mouse!");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
        System.out.println("Don't make any noise, because " + name + " will get angry!");
    }

}
