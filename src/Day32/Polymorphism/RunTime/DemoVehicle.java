package Day32.Polymorphism.RunTime;

public class DemoVehicle {

    public static void main(String[] args) {

        /**
         * Run Time Polymorphism (Dynamic)
         *      Achieved by using "METHOD OVERRIDING"
         */

        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new SportCar();
        Vehicle vehicle3 = new Truck();

        vehicle1.speedUpTo60mph(); // Vehicle is speeding up to 60mph!
        vehicle2.speedUpTo60mph(); // Sport car is speeding up to 60mph....
        vehicle3.speedUpTo60mph(); // Truck is speeding up to 60mph....

    }

}
