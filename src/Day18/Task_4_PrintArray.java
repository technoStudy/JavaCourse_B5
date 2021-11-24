package Day18;

public class Task_4_PrintArray {

    // Create a method which takes String array as a parameter
    // and prints all the element

    public static void main(String[] args) {
        String[] cars = {"Honda", "Toyota", "Porsche", "Tesla", "BMW"};
        printArray(cars);

        String[] colors = {"Blue", "Yellow", "Green", "Black"};
        printArray(colors);

    }


    // I can print any String array using this method
    public static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

}
