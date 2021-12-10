package Day34.CarPackage;

public class ToyotaPrius extends Car implements Diesel, Electric {

    public ToyotaPrius(String model, int productionYear) {
        super(model, productionYear);
    }

    @Override
    public void changeBattery() {
        System.out.println("Change battery every 50000 miles!");
    }

    @Override
    public void changeOil() {
        System.out.println("Change oil every 3000 miles!");
    }
}
