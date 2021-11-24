package Day14;

public class Task_4_PrintArrayInReverseOrder {

//    {"apple", "watermelon", "peach", "strawberry", "kiwi"}
//    print this array in reverse order (using for loop)

    public static void main(String[] args) {

        String[] fruits = {"apple", "watermelon", "peach", "strawberry", "kiwi"};

        // index order
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        System.out.println("---------------");

        // reverse order
        for (int i = fruits.length - 1; i >= 0; i--) {
            System.out.println(fruits[i]);
        }

    }

}
