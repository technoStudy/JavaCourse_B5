package Day34.CarPackage;

public class Tesla extends Car implements Electric {

    public Tesla(String model, int productionYear) {
        super(model, productionYear);
    }

    @Override
    public void changeBattery() {
        System.out.println("Change Battery every 100000 miles!");
    }
}
