package Day28.Homework.Task1;

public class Demo {

    public static void main(String[] args) {

        Account account1 = new Account("abc12345221");

        double balance1 = account1.getBalance();
        System.out.println(balance1);

        String userId = account1.getUserId();
        System.out.println(userId);

        account1.setBalance(10_000);
        double balance2 = account1.getBalance();
        System.out.println(balance2);


    }

}
