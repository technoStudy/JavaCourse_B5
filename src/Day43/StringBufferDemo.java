package Day43;

public class StringBufferDemo {

    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("TechnoStudy");

        str.append(" - Java"); // Does not return a new object, it'll update the existing object!

        System.out.println(str);

        String strConverted = str.toString(); // Can convert StringBuffer into a String

        /**
         * StringBuffer is Synchronized (thread-safe)
         * StringBuffer is slower because it's thread-safe
         */

    }

}
