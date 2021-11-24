package Day25._02_InstanceModifiers.DefaultModifier.Same;

public class Main {

    public static void main(String[] args) {

        Truck truck = new Truck("Volvo");

        System.out.println(truck.truckName);

        truck.getTruckName();

    }

}
