package Day25._01_AccessModifiersForClass.PackageTwo;

import Day25._01_AccessModifiersForClass.PackageOne.Boat;
import Day25._01_AccessModifiersForClass.PackageOne.Car;


public class Main1 {

    Car car = new Car(); // Public

    Boat boat = new Boat(); // Public

//    Not available because it is package-private class,
//    the access modifier is default
//    Plane plane = new Plane();

}
