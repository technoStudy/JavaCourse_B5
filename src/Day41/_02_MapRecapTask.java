package Day41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class _02_MapRecapTask {

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

    }


}
