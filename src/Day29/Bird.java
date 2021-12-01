package Day29;

public class Bird extends Animal {

    double sizeOfWings;
    String color;

    public Bird(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public void sing() {
        System.out.println("piu piu ciu ciu...");
    }

    public void fly() {
        System.out.println("Fly high!");
    }

}
