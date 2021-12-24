package Day43.ExceptionsRecap;

public class Demo {

    public static void main(String[] args) {

        Car car = new Car();

        try {
            car.buy(CarCondition.WASTE);
        } catch (Exception ex) {
            System.out.println("Don't buy this car! It's too old or waste!");
        }

        car.drive("rainy");

    }

}
