package Day38;

import java.util.HashSet;
import java.util.Set;

public class _02_AddedOrNot {

    public static void main(String[] args) {

        Set<Integer> integerSet = new HashSet<>();

        integerSet.add(3);
        integerSet.add(9876);
        integerSet.add(35);
        integerSet.add(0);
        integerSet.add(123445);

        boolean isAdded = integerSet.add(35); // if add method can add the element into set - it will return true
        boolean isAdded2 = integerSet.add(5); // if add method cannot add the element into set - it will return false

        System.out.println(integerSet);
        System.out.println(isAdded);
        System.out.println(isAdded2);

    }

}
