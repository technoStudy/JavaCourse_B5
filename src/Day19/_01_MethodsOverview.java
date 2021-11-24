package Day19;

public class _01_MethodsOverview {

    public static void main(String[] args) {

        String str = "Helloo";
        str.length(); // this method returns an integer
        str.charAt(0); // this method accepts index as a parameter and returns a char


        printFive(); // this method will print 5 in the console
        printNumber(10);
        returnNumber(9);

    }

    public static void printFive() { // this method don't have parameters
        System.out.println(5);
    }

    public static void printNumber(int number) { // this method has "int number" as a parameter
//        int number = 10;
        System.out.println(number);
    }

    public static int returnNumber(int number) { // this method takes in number as a parameter
        return number;                           // and returns number
    }

}
