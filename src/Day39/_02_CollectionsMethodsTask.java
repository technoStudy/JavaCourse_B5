package Day39;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _02_CollectionsMethodsTask {

    // Task
    // create list of 5 numbers from user input
    // sort the list in reverse order and print it
    // shuffle the list and print it
    // rotate right by 3 places and print it


    // part 2: find the max number and min number, print them
    // replace all max number with min number

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number: ");
            arrayList.add(scanner.nextInt());
        }

        System.out.println("This is our ArrayList: " + arrayList);

        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println("ArrayList after reverse order: " + arrayList);

        Collections.shuffle(arrayList);
        System.out.println("ArrayList after shuffle: " + arrayList);

        Collections.rotate(arrayList, 3);
        System.out.println("ArrayList after rotate by 3: " + arrayList);

        Integer max = Collections.max(arrayList);
        Integer min = Collections.min(arrayList);

        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);

        Collections.replaceAll(arrayList, max, min);
        System.out.println("ArrayList after replaceAll: " + arrayList);

    }

}
