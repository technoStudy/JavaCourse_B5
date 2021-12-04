package Day31;

public class Main {

    public static void main(String[] args) {

        /**
         * methods come from Object class (hasCode, toString...)
         * we don't have any methods in "Test" class and it does not extend from anywhere
         * but still we have some methods which are coming from Object class
         *
         * **** Every class inherits from Object class
         */


        Test test = new Test();

        test.hashCode();
        test.toString();

    }

}
