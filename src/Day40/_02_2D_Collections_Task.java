package Day40;

import java.util.ArrayList;

public class _02_2D_Collections_Task {

    // TASK
    // Create 2D ArrayList which can store String ArrayLists
    // Create 3 ArrayLists which are Employees, Employers, Companies
    // Store this 3 ArrayList in 2D ArrayList

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> listOfLists = new ArrayList<>();

            ArrayList<String> employees = new ArrayList<>();
            employees.add("Mike");
            employees.add("Peter");
            employees.add("Lisa");

            ArrayList<String> employers = new ArrayList<>();
            employers.add("Rob");
            employers.add("Alex");

            ArrayList<String> companies = new ArrayList<>();
            companies.add("Amazon");
            companies.add("Google");

        listOfLists.add(employees);
        listOfLists.add(employers);
        listOfLists.add(companies);

        System.out.println(listOfLists);
    }

}
