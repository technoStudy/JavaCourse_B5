package Day23;

public class _01_MainCar {

    public static void main(String[] args) {

        _01_Car car1 = new _01_Car();
        car1.name = "Ford";
        car1.color = "Red";
        car1.addToInventory();

        _01_Car car2 = new _01_Car();
        car2.name = "BMW";
        car2.color = "White";
        car2.addToInventory();

        _01_Car car3 = new _01_Car();
        car3.name = "Toyota";
        car3.color = "White";
        car3.addToInventory();

        System.out.println(car1.name + car2.name);

        System.out.println(_01_Car.numberOfCarsInMyInventory);

        _01_Car.printNumberOfCarsInInventory();

    }

}
