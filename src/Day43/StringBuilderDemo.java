package Day43;

public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("TechnoStudy");

        str.append(" - Java"); // Does not return a new object, instead it'll update existing object!

        System.out.println(str);

        String strConverted = str.toString(); // Can convert into a string

        /**
         * StringBuilder is not Synchronized (thread-safe), but it's faster than StringBuffer
         */

    }

}
