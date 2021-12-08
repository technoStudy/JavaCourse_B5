package Day33.AnimalPackage;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating bone");
    }

    @Override
    public void makeSound() {
        System.out.println("Woff");
    }

    @Override
    public void move() {
        System.out.println("Dog is moving!");
    }
}
