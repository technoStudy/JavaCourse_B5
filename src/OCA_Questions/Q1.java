package OCA_Questions;

public class Q1 {
        private int i = 1;
        public static void main(String argv[]){
            int i = 2;
            Q1 s = new Q1 ();
            s.someMethod();
        }
        public static void someMethod(){
//            System.out.println(i);
        }


//        What will happen when you compile and run the following code?

//        A) 1 will be printed out
//        B) 2 will be printed out
//        C) A compile time error will be generated
//        D) An exception will be thrown

//        Answer: C
//        Because we cannot access instance variables from static methods!
}
