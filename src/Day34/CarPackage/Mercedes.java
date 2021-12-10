package Day34.CarPackage;

public class Mercedes extends Car implements Diesel {

    public Mercedes(String model, int productionYear) {
        super(model, productionYear);
    }

    @Override
    public void changeOil() {
        System.out.println("Change oil every 5000 miles!");
    }

}
