package Day37;

import java.util.HashSet;
import java.util.Set;

public class _03_SetTask {

    // Task
    // Part 1:
    // create a String[] array of student name in your group, duplicate some names
    // add all the elements from String[] to Set

    // Part 2:
    // create a method that takes set and varargs of String and adds all elements to the set
    // public static void addAll(HashSet<String> set, Strings... elements) {}


    public static void main(String[] args) {

        String[] names = {"Adem", "Matthew", "Lana", "Betul", "Amsal", "Adem", "Lana"};

        Set<String> namesSet = new HashSet<>();

        for (int i = 0; i < names.length; i++)
            namesSet.add(names[i]);

        System.out.println(namesSet);

        addAll(namesSet, "Dzuredj", "Feriha", "Arda", "Altyn");

        System.out.println(namesSet);

    }


    public static void addAll(Set<String> set, String... elements) {

        for (int i = 0; i < elements.length; i++)
            set.add(elements[i]);

    }

}
