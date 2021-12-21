package Day40;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class _03_Map {

    /**
            * In Map data is stored in Key-Value format
            * Keys cannot be duplicated, values can be duplicated!
     */

    public static void main(String[] args) {

        // Map contains employee and salary information
        HashMap<String, Integer> salaries = new HashMap<>();
        salaries.put("John", 100_000);
        salaries.put("Mike", 115_000);
        salaries.put("Rita", 140_000);
        salaries.put("Emily", 95_000);
        salaries.put("John", 135_000); // This is duplicated key, we cannot duplicate keys in Map
        salaries.put("Alex", 140_000); // This is duplicated value, we can store duplicate values in Map

        System.out.println("Salaries Map: " + salaries);

        // get() -- can access values by using their keys
        System.out.println("Rita's Salary: " + salaries.get("Rita"));

        // keySet() -- method will return all the keys from Map
        Set<String> keys = salaries.keySet();
        System.out.println("Keys of Salary Map: " + keys);

        // Printing all elements using their keys!
        for (String key : keys)
            System.out.println(key+ " = " + salaries.get(key));

        // values() -- method will return all the values from Map
        Collection<Integer> values = salaries.values();
        System.out.println("Printing all values by using .values() method: " + values);

        // Printing values one by one
        for (Integer value : values)
            System.out.println("Printing all the values one by one: " + value);



    }

}
