package Day16;

public class _05_ForEachWithIndex {

    // find out the index where string starts with "m"

    public static void main(String[] args) {

        String[] list = {"fruits", "vegetables", "meat", "milk"};

        // we cannot solve this task using for-each loop - we don't know the index
        for (String item : list) {
            if (item.startsWith("m")) {
                System.out.println(item);
            }
        }

    }

}
