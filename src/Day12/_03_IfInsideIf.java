package Day12;

public class _03_IfInsideIf {

    public static void main(String[] args) {

        boolean hasHighIncome = false;
        int creditScore = 800;

        // we can use if inside another if
        if (hasHighIncome){
            if (creditScore > 720){
                System.out.println("You are eligible for loan!");
            }else {
                System.out.println("Your credit score is not good enough for loan!");
            }
        }else {
            System.out.println("You are not eligible for loan!!!");
        }

    }

}
