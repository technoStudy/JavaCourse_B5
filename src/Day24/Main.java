package Day24;

public class Main {

    public static void main(String[] args) {
//        BankAccount bankAccount1 = new BankAccount();
//        bankAccount1.customerName = "Emily";
//        bankAccount1.customerSSN = 1231312321;
//        bankAccount1.city = "Brooklyn";

        BankAccount bankAccount1 = new BankAccount("Emily", 12342312, "Brooklyn");


        System.out.println(bankAccount1.customerName);
        System.out.println(bankAccount1.customerSSN);
        System.out.println(bankAccount1.city);


        BankAccount bankAccount2 = new BankAccount("James", 4382942);



    }

}
