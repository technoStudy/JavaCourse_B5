package Day16;

public class _03_ContinueKeyword {

    public static void main(String[] args) {

        // skip 5
        for (int i = 0; i < 10; i++) {
            if (i == 5)
                continue; // continue will move to next iteration

            System.out.println(i); // when i = 5 thi part of the code is skipped
        }

    }

}
