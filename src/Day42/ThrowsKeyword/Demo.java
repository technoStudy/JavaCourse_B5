package Day42.ThrowsKeyword;

import java.io.IOException;

public class Demo {

    public static void main(String[] args) {

        Account account = new Account();

        try {
            account.deposit(-100);
        } catch (IOException ex) {
            System.out.println("The amount is not good!");
        }

    }

}
