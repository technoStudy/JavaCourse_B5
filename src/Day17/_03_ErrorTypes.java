package Day17;

public class _03_ErrorTypes {

    public static void main(String[] args) {

        // Compile Time Errors - Syntax errors

        // name = "Halit"; // Compile Time Error --> Data Type is missing

        // System.out.println(Halit); Compile Time Error --> double quotes are missing

        String name = "Halit";
        // System.out.println(Name); // Java is key sensitive language so "Name" is wrong


        // Run Time Errors - occurs after you run code
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(arr[8]);


    }

}
