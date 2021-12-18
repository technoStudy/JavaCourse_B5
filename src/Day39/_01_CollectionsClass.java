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

        // rotate() -- will move all elements with the distance we provide
        Collections.rotate(arrayList, 2); // positive number will move right, negative will move left
        System.out.println("ArrayList after rotate method: " + arrayList);

        // replaceAll() -- all the values that we provide will be replaced with new value
        Collections.replaceAll(arrayList, 22, 9999999);
        System.out.println("ArrayList after replaceAll method: " + arrayList);

        // max() -- to find biggest number in Collection
        Integer maxValue = Collections.max(arrayList);
        System.out.println("Max value for ArrayList: " + maxValue);

        // min() -- to find smallest number in Collection
        Integer minValue = Collections.min(arrayList);
        System.out.println("Min value for ArrayList: " + minValue);

        // max() and min() methods can be used for Set too!
        Integer maxValueForSet = Collections.max(hashSet);
        System.out.println("Max value for HashSet: " + maxValueForSet);

        Integer minValueForSet = Collections.min(hashSet);
        System.out.println("Min value for HashSet: " + minValueForSet);

        // binarySearch() -- we need to sort List first before using binarySearch
        Collections.sort(arrayList);
        int indexOf44 = Collections.binarySearch(arrayList, 44);
        System.out.println(indexOf44);

    }

}
