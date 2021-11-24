package Day18;

public class Task_1_Methods {

    // create a simple public static void method to print "Hello World!" 5 times

    public static void main(String[] args) {
        printHelloFiveTimes();
    }

    // When we call this method - it'll print "Hello World!" 5 times!!!
    public static void printHelloFiveTimes() {
        for (int i = 0; i < 5; i++)
            System.out.println("Hello World!");
    }

}
