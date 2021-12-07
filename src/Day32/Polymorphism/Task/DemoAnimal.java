package Day32.Polymorphism.Task;

public class DemoAnimal {

    public static void main(String[] args) {

        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
        Animal animal3 = new Horse();

        animal1.run();
        animal1.makeSound();

        System.out.println("********************************");

        animal2.run(50);
        animal2.makeSound();

        System.out.println("********************************");

        animal3.run(10, "miles");
        animal3.makeSound();

        System.out.println("******************************** \n");

//        ---------------------------------

        Animal[] animals = {new Dog(), new Cat(), new Horse()};

        // Iterate animals array using for-each loop - and call makeSound() method
        for (Animal animal : animals) {
            animal.makeSound();
        }

        // Iterate animals array using for loop - and call makeSound() method
        for (int i = 0; i < animals.length; i++) {
            animals[i].makeSound();
        }







    }

}
