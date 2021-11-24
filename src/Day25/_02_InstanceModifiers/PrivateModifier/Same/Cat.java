package Day25._02_InstanceModifiers.PrivateModifier.Same;

public class Cat {

    private String catName;

    public Cat() {
        catName = "Some cat";
    }

    private Cat(String catName) {
        this.catName = catName;
    }

    private String getCatName() {
        return catName;
    }

}
