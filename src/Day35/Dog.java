package Day35;

public class Dog {

    String name;
    int age;

    public void eat() {
        System.out.println("Dog is eating!");
    }
}

class Demo {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Mikey";
        dog.age = 5;
        dog.eat();
    }

}
