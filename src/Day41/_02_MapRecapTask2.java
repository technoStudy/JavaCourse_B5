package Day41;

import java.util.*;

public class _02_MapRecapTask2 {

    // PART 1
    // create a map with groupName as key and groupMembers as value
    // "Group1" = ["Member1", "Member2"]
    // "Group2" = ["Member3", "Member4", "Member5"]

    // PART 2
    // find how many members each group has

    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> groupsAndMembers = new HashMap<>();

        ArrayList<String> devTeam =
                new ArrayList<>(Arrays.asList("Idriz", "Amsal", "Lana", "Ayna"));
        ArrayList<String> qaTeam =
                new ArrayList<>(Arrays.asList("Shuang", "Yusuf", "Feriha"));

        groupsAndMembers.put("DevelopmentTeam", devTeam);
        groupsAndMembers.put("QaTeam", qaTeam);

        System.out.println(groupsAndMembers);


        // Part 2
        // Solution 1
        Collection<ArrayList<String>> values = groupsAndMembers.values();
        for (ArrayList<String> element : values) {
            int numberOfMembers = element.size();
            System.out.println(numberOfMembers);
        }


        // Solution 2
        Set<String> keys = groupsAndMembers.keySet();
        for (String key : keys) {
            ArrayList<String> membersList = groupsAndMembers.get(key);
            System.out.println("Number of members in group " + key + " " + membersList.size());
        }

    }

}
