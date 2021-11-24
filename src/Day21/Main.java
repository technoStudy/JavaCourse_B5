package Day21;

public class Main {

    public static void main(String[] args) {

        Dog lucy = new Dog(); // Create a new Dog object
        lucy.breed = "Neapolitan Mastiff"; // initialize breed property of lucy object
        lucy.size = "Large";
        lucy.age = 5;
        lucy.color = "Black";

        System.out.println(lucy.breed);
        System.out.println(lucy.age);

        lucy.eat();

        lucy.sleep();
        lucy.snoring();

        lucy.wakeUp();
        lucy.snoring();

        //  -------------------------------------------- \\

        Dog max = new Dog();

        max.breed = "Maltese";
        max.size = "Small";
        max.age = 2;
        max.color = "White";

        System.out.println(max.size);
        System.out.println(max.color);

        max.sleep();
        System.out.println(max.isSleeping);

        max.wakeUp();
        System.out.println(max.isSleeping);



        //  -------------------------------------------- \\

        Dog cooper = new Dog();

        cooper.breed = "Chow Chow";
        cooper.size = "Medium";
        cooper.age = 3;
        cooper.color = "Brown";
        cooper.isSleeping = true;

        cooper.wakeUp();
        System.out.println(cooper.isSleeping);

    }

}
