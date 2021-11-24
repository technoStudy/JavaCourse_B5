package Day20;

public class _03_MethodVarargs {

    public static void main(String[] args) {
        System.out.println(allStringInSameLine("Java", "Python", "JavaScript", "C"));
    }


    public static String allStringInSameLine(String... varargs) {
//        String[] varargs = {"Java", "Python", "JavaScript", "C"};
        String allString = "";
        for (int i = 0; i < varargs.length; i++)
            allString += varargs[i];

        return allString;
    }

}
