package Day41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class _03_MapRecapTask3 {

//        TASK
//    Following Map is given:
//    Find how many titles each team won

    public static void main(String[] args) {

        HashMap<String, ArrayList<Integer>> titleWonYears = new HashMap<>();

        ArrayList<Integer> barca = new ArrayList<>(Arrays.asList(1990, 1995, 2003, 2020));
        ArrayList<Integer> real = new ArrayList<>(Arrays.asList(1992, 2008, 2011, 2012, 2014, 2015));
        ArrayList<Integer> juve = new ArrayList<>(Arrays.asList(2005, 2021));

        titleWonYears.put("Barcelona", barca);
        titleWonYears.put("Real Madrid", real);
        titleWonYears.put("Juventus", juve);

        System.out.println(titleWonYears);

        Set<String> keys = titleWonYears.keySet();
        for (String key : keys) {
            ArrayList<Integer> years = titleWonYears.get(key); // titleWonYears.get("Barcelona");
            int yearsSize = years.size();
            System.out.println(key + " won " + yearsSize + " titles!");
        }

    }

}
