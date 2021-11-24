package Day25._02_InstanceModifiers.PublicModifier.Other;

import Day25._02_InstanceModifiers.PublicModifier.Same.Car;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Mercedes");

        System.out.println(car.carName);

        car.getCarName();

    }
}
