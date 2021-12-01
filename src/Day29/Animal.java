package Day29;

public class Animal {

    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sleep() {
        System.out.println("ZzZzZzZz...");
    }

    public void eat() {
        System.out.println("Nom Nom Nom...");
    }

}
