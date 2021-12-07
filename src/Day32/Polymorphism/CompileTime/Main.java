package Day32.Polymorphism.CompileTime;

public class Main {

    public static void main(String[] args) {

        /**
         *  Compile Time Polymorphism (Static Polymorphism)
         *      - Achieved by "METHOD OVERLOADING"
         */

        Calculation.sum(5, 9);              // accepts 2 integers

        Calculation.sum(6, 13, 7);          // accepts 3 integers

        Calculation.sum(33.865, 12.43);     // accepts 2 doubles

        Calculation.sum(8.4, 1.98, 44.4);   // accepts 3 doubles


    }

}
