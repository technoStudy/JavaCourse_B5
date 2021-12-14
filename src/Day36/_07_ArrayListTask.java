package Day36;

import java.util.ArrayList;

public class _07_ArrayListTask {

    // Part1:
    // Create an arraylist of Strings
    // add - "Red", "Green", "Blue", "Yellow" and "Black" inside
    // print out all the elements, each element on new line

    // Part2:
    // Create a method that accepts a String arraylist and a String as parameters
    // method should add the element at the first index of arraylist

    // Part3:
    // Create a method that accepts a String arraylist and a String as parameters
    // it should add element before last element
    // ex:  [1, 2, 3]  -> [1, 2, 4, 3]

    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");

        for (int i = 0; i < colors.size(); i++)
            System.out.println(colors.get(i));

        addElementAtIndex0(colors, "White");
        System.out.println(colors);

    }

    private static void addElementAtIndex0(ArrayList<String> list, String element) {
        list.add(0, element);
    }

}
