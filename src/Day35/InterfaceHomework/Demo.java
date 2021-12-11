package Day35.InterfaceHomework;

public class Demo {

    public static void main(String[] args) {

        Vehicle car = new Car();
        car.speed();

        Vehicle train = new Train();
        train.speed();

        Boat boat = new Boat();
        boat.speed();
        boat.sail();

        Plane plane = new Plane();
        plane.speed();
        plane.fly();

        SpaceShip spaceShip = new SpaceShip();
        spaceShip.speed();
        spaceShip.sail();
        spaceShip.fly();

    }

}
