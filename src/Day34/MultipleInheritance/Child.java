package Day34.MultipleInheritance;

public class Child implements ParentOne, ParentTwo {

    @Override
    public void methodOne() {
        System.out.println("This is from Parent 1");

        System.out.println(variable1); // coming from Parent1
        System.out.println(variable3); // coming from Parent2

        System.out.println(ParentOne.variable2); // same named variable from Parent1
        System.out.println(ParentTwo.variable2); // same named variable from Parent2

    }

    // We have this method in both Parent Interfaces but overriding once is enough!!!
    @Override
    public void methodTwo() {
        System.out.println("This is from both Parent 1 and Parent 2");
    }

    @Override
    public void methodThree() {
        System.out.println("This is from Parent 2");
    }
}
