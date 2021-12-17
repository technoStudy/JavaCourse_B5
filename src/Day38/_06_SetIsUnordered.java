package Day38;

import java.util.HashSet;
import java.util.Set;

public class _06_SetIsUnordered {

    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Even though the output is [1, 2, 3]
        // that doesn't mean HashSet is ordered!!!!!
        System.out.println(numbers);

    }

}
