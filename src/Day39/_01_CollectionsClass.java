package Day39;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class _01_CollectionsClass {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();

        Random rnd = new Random();

        for (int i = 0; i < 5; i++) {
            int randomNumber = rnd.nextInt(10);
            arrayList.add(randomNumber);
            hashSet.add(randomNumber);
        }

        System.out.println("ArrayList when it's created: " + arrayList);
        System.out.println("HashSet when it's created: " + hashSet); // not allow duplicate values

        Integer[] numbers = {99, 55, 22, 44};

        // addAll() -- to add multiple elements to List/Set
        Collections.addAll(arrayList, numbers);
        System.out.println("ArrayList after adding multiple elements: " + arrayList);

        // sort() -- sort list in ascending order (natural order)
        Collections.sort(arrayList);
        System.out.println("ArrayList after sort method: " + arrayList);

        // reverseOrder() -- sorts elements in descending (reverse order)
        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println("ArrayList after sorting in reverse order: " + arrayList);

        // shuffle() -- shuffles list randomly
        Collections.shuffle(arrayList);
        System.out.println("ArrayList after shuffle method: " + arrayList);

        // rotate() --
        Collections.rotate(arrayList, 2);
        System.out.println("ArrayList after rotate method: " + arrayList);

    }

}
