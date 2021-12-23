package Day42.ThrowKeyword;

public class Demo {

    public static void main(String[] args) {

        Account account = new Account();

        account.deposit(-100);
        System.out.println(account.balance);

    }

}
