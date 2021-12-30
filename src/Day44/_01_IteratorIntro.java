package Day44;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class _01_IteratorIntro {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Iterator<String> it = cars.iterator();

        // To get first element we use next()!
        // System.out.println(it.next());

        // Printing all elements in arrayList using Iterator
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        numbers.add(42);
        numbers.add(9);
        numbers.add(10);

        Iterator<Integer> iterator = numbers.iterator();

        // Remove elements from list using iterator
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number < 10) {
                iterator.remove();
            }
        }

        System.out.println(numbers);


        /*********************TASK**********************/

        HashSet<String> names = new HashSet<>();
        names.add("Mike");
        names.add("Steven");
        names.add("Alex");
        names.add("Robin");
        names.add("Amanda");

        // Part1: Using iterator print all the elements 1 by 1
        Iterator<String> setIterator = names.iterator();

        while (setIterator.hasNext()) {
            System.out.println(setIterator.next());
        }

        // Part2: Iterate over set by using iterator and get every element
        //        If element starts with 'A' then remove element

    }

}
