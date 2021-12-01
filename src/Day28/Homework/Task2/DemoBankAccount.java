package Day28.Homework.Task2;

public class DemoBankAccount {

    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount("123456789", Currency.USD);

        System.out.println(bankAccount1.getUserId());
        System.out.println(bankAccount1.getCurrency());

        bankAccount1.deposit(5000);
        System.out.println(bankAccount1.getBalance());

        bankAccount1.withdraw(1500);
        System.out.println(bankAccount1.getBalance());

    }

}
