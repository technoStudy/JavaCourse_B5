package Day29;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    public void lickOwner() {
        System.out.println("Dog is licking it's owner!");
    }

}
