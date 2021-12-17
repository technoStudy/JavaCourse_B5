package Day38;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class _05_TypesOfSet {

    public static void main(String[] args) {

        // HashSet -- Unordered collection - Don't allow duplicates
        Set<String> countriesHashSet = new HashSet<>();
        countriesHashSet.add("USA");
        countriesHashSet.add("France");
        countriesHashSet.add("Turkey");
        countriesHashSet.add("China");
        countriesHashSet.add("Germany");
        countriesHashSet.add("Mexico");
        countriesHashSet.add("Mexico"); // cannot store duplicate values

        System.out.println(countriesHashSet);


        // LinkedHashSet -- maintains insertion order - Don't allow duplicates
        Set<String> countriesLinkedHashSet = new LinkedHashSet<>();
        countriesLinkedHashSet.add("USA");
        countriesLinkedHashSet.add("France");
        countriesLinkedHashSet.add("Turkey");
        countriesLinkedHashSet.add("China");
        countriesLinkedHashSet.add("Germany");
        countriesLinkedHashSet.add("Mexico");
        countriesLinkedHashSet.add("Mexico"); // cannot store duplicate values

        System.out.println(countriesLinkedHashSet);


        // TreeSet -- sorted - it stores elements in ascending order
        Set<String> countriesTreeSet = new TreeSet<>();
        countriesTreeSet.add("USA");
        countriesTreeSet.add("France");
        countriesTreeSet.add("Turkey");
        countriesTreeSet.add("China");
        countriesTreeSet.add("Germany");
        countriesTreeSet.add("Mexico");
        countriesTreeSet.add("Mexico"); // cannot store duplicate values

        System.out.println(countriesTreeSet);

    }

}
