package Day37;

import java.util.HashSet;
import java.util.Set;

public class _04_PrintElementsOfSet {

    public static void main(String[] args) {

        Set<String> cars = new HashSet<>();

        cars.add("Mercedes");
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Tesla");

        System.out.println(cars);

        // We can print all the elements one by one using for each loop
        for (String car : cars)
            System.out.println(car);


        // Get specific element from Set
        // (not recommended, use Array or ArrayList instead of Set)
        for (String car : cars) {
            if (car.equals("Toyota"))
                System.out.println(car);
        }

    }

}
