package Day39;

import java.util.*;

public class _03_ConvertingCollections {

    public static void main(String[] args) {

        // Converting Array into a List
        Integer[] array = {5, 10, 20, 40, 60};

        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(list);


        // WRONG WAY to convert array into List!!!
        // List<Integer> list2 = Arrays.asList(array);
        // You'll get fixed-size list in this case!!!
        // list2.add(10010); -- unsupported operation!


        // Converting List into Array
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(10);

        // we'll put 0 for new Array size, JVM will handle the size
        Integer[] convertedArray = arrayList.toArray(new Integer[0]);


        // Converting Array into Set
        Integer[] newArray = {8, 43, 2, 1, 7};

        Set<Integer> set = new HashSet<>(Arrays.asList(newArray));

        // Converting Set into Array
        Set<Integer> integerSet = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(5);

        Integer[] arrayFromSet = integerSet.toArray(new Integer[0]);


        // Converting List into Set
        List<Integer> integerList2 = new ArrayList<>();
        integerList2.add(9);
        integerList2.add(8);
        integerList2.add(7);
        integerList2.add(9);

        Set<Integer> integerSet1 = new HashSet<>(integerList2);
        System.out.println("List converted to Set: " + integerSet1);


        // Converting Set into List
        Set<Integer> numbers = new HashSet<>();
        numbers.add(8);
        numbers.add(2);

        List<Integer> myList = new ArrayList<>(numbers);

    }

}
