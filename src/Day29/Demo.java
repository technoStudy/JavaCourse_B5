package Day29;

public class Demo {

    public static void main(String[] args) {

        Animal animal = new Animal("Cinnamon", 4);

        animal.eat();
        animal.sleep();


        Cat cat = new Cat("Red", 1);

        cat.eat();
        cat.sleep();
        cat.catchFly();
        System.out.println(cat.name);
        System.out.println(cat.age);


        Dog dog = new Dog("Jacky", 7);

        dog.eat();
        dog.sleep();
        dog.lickOwner();


        Bird bird = new Bird("Zazu", 1);

        bird.sizeOfWings = 5.5;
        bird.color = "red";

        bird.eat();
        bird.sleep();

        bird.sing();
        bird.fly();


    }

}
