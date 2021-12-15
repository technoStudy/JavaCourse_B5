package Day36;

import java.util.ArrayList;
import java.util.Random;

public class _08_ArrayListTask {

    // TASK
    // part 1:
    // create a method that will create an arrayList of integers
    // with 5 random numbers(1 to 10) and return the created ArrayList

    // part 2:
    // create a method that updates the middle element to the element that's provided in parameter
    // [3, 4, 1, 6, 9]  -> provided parameter 100 -> [3, 4, 100, 6, 9]

    public static void main(String[] args) {

        ArrayList<Integer> newArrayList = createRandomArrayList();
        System.out.println(newArrayList);
        updateMiddleElement(newArrayList, 50);
        System.out.println(newArrayList);

    }

    public static ArrayList<Integer> createRandomArrayList() {

        ArrayList<Integer> arrayList = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 5; i++)
            arrayList.add(random.nextInt(10) + 1);

        return arrayList;

    }

    public static void updateMiddleElement(ArrayList<Integer> list, Integer newValue) {
        int middleIndex = list.size() / 2;
        list.set(middleIndex, newValue);
    }

}
