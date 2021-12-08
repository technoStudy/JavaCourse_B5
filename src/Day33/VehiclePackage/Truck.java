package Day33.VehiclePackage;

public class Truck extends Vehicle {

    public Truck(int year, int horsePower) {
        super(year, horsePower);
    }

    @Override
    public void move(int meters) {
        System.out.println("Truck is moving " + meters + " meters");
    }

    @Override
    public void move(int units, String unit) {
        System.out.println("Truck is moving " + units + unit);
    }

    @Override
    public void fuelUp(int liters) {
        System.out.println("Truck is fueling up " + liters + "liters");
    }
}
