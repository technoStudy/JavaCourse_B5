package Day33.VehiclePackage;

public class SportCar extends Vehicle {

    public SportCar(int year, int horsePower) {
        super(year, horsePower);
    }

    @Override
    public void move(int meters) {
        System.out.println("Sport car is moving " + meters + " meters");
    }

    @Override
    public void move(int units, String unit) {
        System.out.println("Sport car is moving " + units + unit);
    }

    @Override
    public void fuelUp(int liters) {
        System.out.println("Sport car will fuelUp " + liters + "liters");
    }

}
