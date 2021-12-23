package Day42.ThrowsKeyword;

import java.io.IOException;

public class Account {

    double balance;

    public void deposit(double moneyToDeposit) throws IOException {
        if (moneyToDeposit <= 0) {
            throw new IOException();
        }
        balance += moneyToDeposit;
    }

    public void withdraw(double moneyToWithdraw) throws IOException {
        if (moneyToWithdraw > balance) {
            throw new IOException();
        }
        balance -= moneyToWithdraw;
    }

}
