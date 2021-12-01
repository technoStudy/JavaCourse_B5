package Day29;

public class Penguins extends Animal {

//    String name;   - coming from parent
//    int age;       - coming from parent
    int weight;
    int height;

    public Penguins(String name, int age, int weight, int height) {
        super(name, age);
        this.weight = weight;
        this.height = height;
    }
}
