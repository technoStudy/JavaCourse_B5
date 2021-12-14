package Day35;

public class ImmutableExampleClass {

    final int variable;

    public ImmutableExampleClass(int parameter) {
        this.variable = parameter;
    }

}

class test {

    public static void main(String[] args) {
        ImmutableExampleClass ex = new ImmutableExampleClass(10);
        System.out.println(ex.variable);
//        ex.variable = 20; - we cannot update this value because it's immutable
    }

}