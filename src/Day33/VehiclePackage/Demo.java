package Day33.VehiclePackage;

public class Demo {

    public static void main(String[] args) {

        Vehicle sportCar = new SportCar(2018, 630);

        System.out.println(sportCar.getYear());
        System.out.println(sportCar.getHorsePower());

        sportCar.move(5000);
        sportCar.fuelUp(30);

        Vehicle truck = new Truck(2012, 550);

        System.out.println(truck.getYear());
        System.out.println(truck.getHorsePower());

        truck.move(25, "Miles");
        truck.fuelUp(100);

    }

}
