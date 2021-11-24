package Day25._02_InstanceModifiers.PrivateModifier.Same;

public class Main {

    public static void main(String[] args) {

//        We cannot do this because that constructor is private
//        Cat cat = new Cat("Hello");

        Cat cat = new Cat();

//        Not Accessible - because field is PRIVATE
//        cat.catName;

//        Not Accessible - because method is PRIVATE
//        cat.getCatName();


    }

}
