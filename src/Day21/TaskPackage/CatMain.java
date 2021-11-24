package Day21.TaskPackage;

public class CatMain {

    public static void main(String[] args) {

        Cat arya = new Cat();

        arya.age = 1;
        arya.color = "White and Black";

        arya.meow();

        System.out.println("Age of Arya: " + arya.age);
        System.out.println("Color of Arya: " + arya.color);

        printCatProperties(arya);



        Cat red = new Cat();

        red.age = 1;
        red.color = "Black";

        red.meow();

        System.out.println("Age of Red: " + red.age);
        System.out.println("Color of Red: " + red.color);

        red.printProperties();

    }

    public static void printCatProperties(Cat cat) {
        System.out.println("Color: " + cat.color);
        System.out.println("Age: " + cat.age);
    }

}
