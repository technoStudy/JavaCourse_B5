package Day31.VehiclePackage;

public class Truck extends Vehicle {

    public Truck(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void speedUpTo60() {
        System.out.println("Truck is speeding up to 60 mph in 10 seconds!");
    }

    @Override
    public void breakDownFrom60() {
        System.out.println("Truck is breaking from 60 mph to 0 in 8 seconds!");
    }

}
