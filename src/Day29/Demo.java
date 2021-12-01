package Day29;

public class Demo {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.name = "Cinnamon";
        animal.age = 4;

        animal.eat();
        animal.sleep();


        Cat cat = new Cat();
        cat.name = "Red";
        cat.age = 1;

        cat.eat();
        cat.sleep();
        cat.catchFly();
        System.out.println(cat.name);
        System.out.println(cat.age);


        Dog dog = new Dog();
        dog.name = "Jacky";
        dog.age = 7;

        dog.eat();
        dog.sleep();
        dog.lickOwner();


        Bird bird = new Bird();
        bird.name = "Zazu";
        bird.age = 1;
        bird.sizeOfWings = 5.5;
        bird.color = "red";

        bird.eat();
        bird.sleep();

        bird.sing();
        bird.fly();


    }

}
