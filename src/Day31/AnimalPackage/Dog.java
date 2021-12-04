package Day31.AnimalPackage;

public class Dog extends Animal {

    // Task
    // Override methods from parent class

    @Override
    public void eat() {
        System.out.println(name + " eating a food!");
    }

    @Override
    public void sleep() {
        System.out.println(name + " in sleep!");
        System.out.println("ZzzZzZzZz...");
    }


}
