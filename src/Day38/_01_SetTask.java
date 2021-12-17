package Day38;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class _01_SetTask {

    // PART 1
    // create a method that accepts ArrayList<Integer> and Set<Integer> as parameters
    // and add all elements from ArrayList to Set

    // PART 2
    // create a method that takes Set<Character> and varargs of char as parameters
    // and adds all chars to the set

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

        // This set will contain only unique values from the arrayList
        System.out.println("Set after using convert method: " + set);


        Set<Character> characterSet = new HashSet<>();

        addCharactersToSet(characterSet, 'A', 'F', 'r', 'R', 'Q');

        System.out.println("Character Set: " + characterSet);

    }

    // With this method we're converting Arraylist into Set
    // Also we get rid of duplicate values - set will store only unique elements from arrayList
    public static void convertArrayListIntoSet(ArrayList<Integer> list, Set<Integer> set) {
        for (Integer number : list)
            set.add(number);
    }


    public static void addCharactersToSet(Set<Character> set, Character... chars) {
        for (int i = 0; i < chars.length; i++)
            set.add(chars[i]);
    }

}
