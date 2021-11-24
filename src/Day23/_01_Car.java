package Day23;

public class _01_Car {
    /*
        Instance Variables (Fields)
            - instance members belongs to objects
            - to access instance fields you need to create an object
            - for each object 1 copy (of each instance variable) will be created
     */
    String name;
    String color;

    /*
        Static Variables Fields
            - static fields belongs to class
            - to access static field you need call with class name
            - there will be only 1 copy (of static variable)
     */
    static int numberOfCarsInMyInventory;


    public void addToInventory() {
        numberOfCarsInMyInventory++;
    }

    public static void printNumberOfCarsInInventory() {
        System.out.println(numberOfCarsInMyInventory);
    }

}
