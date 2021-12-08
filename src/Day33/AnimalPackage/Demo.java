package Day33.AnimalPackage;

public class Demo {

    public static void main(String[] args) {

        Animal cat = new Cat("Arya", 1);

        System.out.println(cat.getName());
        System.out.println(cat.getAge());

        cat.eat();
        cat.move();
        cat.makeSound();

        System.out.println("********************");

        Animal dog = new Dog("Jackie", 4);

        System.out.println(dog.getName());
        System.out.println(dog.getAge());

        dog.eat();
        dog.makeSound();
        dog.move();

    }

}
