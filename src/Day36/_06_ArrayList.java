package Day36;

import java.util.ArrayList;
import java.util.Arrays;

public class _06_ArrayList {

    public static void main(String[] args) {

        int[] array = new int[3]; // this is fixed-size array
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        System.out.println(Arrays.toString(array));
        System.out.println(array[0]); // get element from array

        // create an ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();

        // list.add() --- adding elements into arrayList
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(90);

        // list.get(index) -- getting element at a specific index
        Integer elementAtIndex2 = arrayList.get(2);
        System.out.println(elementAtIndex2);

        // list.add(index, element) --- add new element to a specific index
        arrayList.add(0, 1);
        System.out.println(arrayList);

        // Printing an ArrayList
        System.out.println(arrayList);


    }

}
