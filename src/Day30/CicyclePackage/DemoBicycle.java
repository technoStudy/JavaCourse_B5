package Day30.CicyclePackage;

public class DemoBicycle {

    public static void main(String[] args) {

        RaceBike raceBike = new RaceBike(24, 26);
        System.out.println("RaceBike gear: " + raceBike.gear);
        System.out.println("RaceBike wheelSize: " + raceBike.wheelSize);

        raceBike.speedUp(10);
        System.out.println("RaceBike speed after speedUp: " + raceBike.speed);

        raceBike.applyBreak(3);
        System.out.println("RaceBike speed after break: " + raceBike.speed);



        KidsBike kidsBike = new KidsBike(1, 4);
        System.out.println("KidsBike gear:" + kidsBike.gear);
        System.out.println("KidsBike numberOfWheels: " + kidsBike.numberOfWheels);

        kidsBike.speedUp(5);
        System.out.println(kidsBike.speed);

        kidsBike.applyBreak(2);
        System.out.println(kidsBike.speed);



        ElectricBike electricBike = new ElectricBike(18, "bosch", 500);
        System.out.println("ElectricBike gear: " + electricBike.gear);
        System.out.println("ElectricBike batteryType: " + electricBike.batteryType);
        System.out.println("ElectricBike batteryCapacity: " + electricBike.batteryCapacity);

        electricBike.speedUp(45);
        System.out.println("ElectricBike speed: " + electricBike.speed);

        electricBike.applyBreak(15);
        System.out.println("ElectricBike speed: " + electricBike.speed);

        electricBike.chargeBattery(50);
        System.out.println("ElectricBike batteryLevel: " + electricBike.batteryLevel);

    }

}
