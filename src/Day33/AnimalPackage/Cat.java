package Day33.AnimalPackage;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating a fish");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void move() {
        System.out.println("Cat is moving!");
    }

}
