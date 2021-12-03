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

    }

}
