package Day19;

public class _02_MethodsOverview {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        printIntArray(array1);

        int[] array2 = {15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        printIntArray(array2);

        String[] cities = {"New York", "Paris", "Amsterdam", "London", "Genk"};
        printStringArray(cities);

    }

    // we can print any int array using this method!!!
    public static void printIntArray(int[] array) {
        for (int i = 0; i <= array.length-1; i++)
            System.out.println(array[i]);
    }

    // quick task: write a method which will print any String array
    public static void printStringArray(String[] array) {
        for (int i = 0; i <= array.length-1; i++)
            System.out.println(array[i]);
    }

}
