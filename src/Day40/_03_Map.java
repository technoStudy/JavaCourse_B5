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

        // size()
        int sizeOfMap = salaries.size();
        System.out.println("Number of Entries: " + sizeOfMap);

        // isEmpty()
        boolean isMapEmpty = salaries.isEmpty();
        System.out.println("Map is empty: " + isMapEmpty);

        // putIfAbsent() -- will add a new entry if key doesn't exist
        // If key exist in that scenario it's not going to update value
        salaries.putIfAbsent("Halit", 75_000);
        System.out.println(salaries);
        salaries.putIfAbsent("Rita", 200_000);
        System.out.println(salaries);

        // containsKey() -- returns boolean - checks if map contains key or not
        boolean isMapContainMike = salaries.containsKey("Mike");
        System.out.println("Does map has \"Mike\" ? " + isMapContainMike);

        // containsValue() -- returns boolean - check if map contains value or not
        boolean isMapContain500k = salaries.containsValue(500_000);
        System.out.println("Does map contain 500k value ? " + isMapContain500k);

        // clear() -- remove all entries from map!
        salaries.clear();
        System.out.println("Salaries map after clear() method: " + salaries);
        isMapEmpty = salaries.isEmpty();
        System.out.println(isMapEmpty);

    }

}
