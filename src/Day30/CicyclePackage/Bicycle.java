package Day30.CicyclePackage;

public class Bicycle {

    int gear;
    int speed = 0;

    public Bicycle(int gear) {
        this.gear = gear;
    }

    public void speedUp(int incrementSpeed) {
        speed += incrementSpeed;
    }

    public void applyBreak(int decrementSpeed) {
        speed -= decrementSpeed;
    }

}
