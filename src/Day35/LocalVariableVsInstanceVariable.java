package Day35;

public class LocalVariableVsInstanceVariable {

    int variable1 = 10; // instance variable

    public void method() {
        int variable2 = 20; // local variable - only accessible within declared code block
        System.out.println(variable2);
    }

}
