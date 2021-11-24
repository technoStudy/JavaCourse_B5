package Day23.BankAccount_StaticTask;

public class BankAccount {

    String customerName;
    double customerBalance = 0;

    static double totalBalance = 0;

    public void deposit(double moneyToDeposit) {
        customerBalance += moneyToDeposit;
        totalBalance += moneyToDeposit;
    }

    public void withdraw(double moneyToWithdraw) {
        customerBalance -= moneyToWithdraw;
        totalBalance -= moneyToWithdraw;
    }

}
