package Day37;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _02_Set {

    public static void main(String[] args) {

        // Creating Set
        Set<Integer> integerSet = new HashSet<>();

        // Adding Elements into Set (Cannot store duplicate values)
        integerSet.add(10);
        integerSet.add(20);
        integerSet.add(30);
        integerSet.add(10);

        // Printing Set
        System.out.println(integerSet);

        // set.size() -- returns number of elements in Set
        System.out.println(integerSet.size());

        // set.isEmpty() -- checks if Set is empty or not
        System.out.println(integerSet.isEmpty());

        // set.contains() -- returns boolean
        System.out.println("Is set contains 10? " + integerSet.contains(10));

        // set.remove(Object)
        integerSet.remove(20);
        System.out.println(integerSet);

        // set.clear()
        integerSet.clear();
        System.out.println(integerSet);

        // set.get(1); DON'T HAVE GET METHOD IN SET

        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(10);

        System.out.println(integerList);

    }

}
