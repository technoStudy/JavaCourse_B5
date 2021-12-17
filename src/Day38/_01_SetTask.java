package Day38;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class _01_SetTask {

    // create a method that accepts ArrayList<Integer> and Set<Integer> as parameters
    // and add all elements from ArrayList to Set

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(10);
        arrayList.add(20);

        System.out.println("Elements in ArrayList: " + arrayList );

        Set<Integer> set = new HashSet<>();

        System.out.println("Set before using convert method: " + set);

        convertArrayListIntoSet(arrayList, set);

        System.out.println("Set after using convert method: " + set);

    }


    public static void convertArrayListIntoSet(ArrayList<Integer> list, Set<Integer> set) {
        for (Integer number : list)
            set.add(number);
    }

}
