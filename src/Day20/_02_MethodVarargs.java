package Day20;

public class _02_MethodVarargs {

    public static void main(String[] args) {

       sum(1, 2, 3, 4);

    }

    public static int sum(int... varargs) { // A variable argument is represented by (...) three dots
//        int[] varargs = {1, 2, 3, 4};
        int sum = 0;
        for (int i = 0; i < varargs.length; i++)
            sum += varargs[i];

        return sum;
    }




/**    Instead of using all the overloaded methods below we can use varargs, check the method above!!! **/

//    public static int sum(int a, int b) {
//        return a + b;
//    }
//
//    public static int sum(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    public static int sum(int a, int b, int c, int d) {
//        return a + b + c + d;
//    }


}
