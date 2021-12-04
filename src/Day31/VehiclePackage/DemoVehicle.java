package Day31.VehiclePackage;

public class DemoVehicle {

    public static void main(String[] args) {

        SportCar vehicle1 = new SportCar("Mercedes", "c63 AMG", 2020);

        System.out.println(vehicle1.make);
        System.out.println(vehicle1.model);
        System.out.println(vehicle1.year);

        vehicle1.speedUpTo60();
        vehicle1.breakDownFrom60();

        System.out.println("*****************************");

        Truck vehicle2 = new Truck("Ford", "F150", 2018);

        System.out.println(vehicle2.make);
        System.out.println(vehicle2.model);
        System.out.println(vehicle2.year);

        vehicle2.speedUpTo60();
        vehicle2.breakDownFrom60();

    }

}
