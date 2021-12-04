package Day31.AnimalPackage;

public class DemoAnimal {

    public static void main(String[] args) {

        Cat cat1 = new Cat();

        cat1.name = "Arya";
        cat1.age = 2;

        cat1.eat();
        cat1.sleep();

        System.out.println("****************************");

        Dog dog1 = new Dog();

        dog1.name = "Jonny";
        dog1.age = 6;

        dog1.eat();
        dog1.sleep();


    }

}
