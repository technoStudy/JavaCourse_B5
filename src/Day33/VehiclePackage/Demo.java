package Day33.VehiclePackage;

public class Demo {

    public static void main(String[] args) {

        Vehicle sportCar = new SportCar(2018, 630);

        System.out.println(sportCar.getYear());
        System.out.println(sportCar.getHorsePower());

        sportCar.move(5000);
        sportCar.fuelUp(30);

    }

}
