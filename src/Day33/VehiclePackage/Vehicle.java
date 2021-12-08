package Day33.VehiclePackage;

public abstract class Vehicle {

    /**
     *   - Abstract methods can be overloaded
     *   - abstract int year; | not possible - cannot use abstract keyword for variables
     *
     */

    private int year;
    private int horsePower;

    public Vehicle(int year, int horsePower) {
        this.year = year;
        this.horsePower = horsePower;
    }

    public int getYear() {
        return year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public abstract void move(int meters);

    public abstract void move(int units, String unit);

    public abstract void fuelUp(int liters);

}
