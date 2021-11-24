package Day24;

public class BankAccount {

    // Every class has a constructor even we did not create any (default constructor)
    // Constructor will always have the same name with class

    // Method VS Constructor

    // - Constructor will always have the same name with class
    // - Method can have any name

    // - Constructor don't need any return even void
    // - Method should have a return type at least void

    // - Constructor will be created automatically by JVM (default constructor
    // - Method will not be created automatically

    // - We use constructor to initialize instance of an object
    // - We use method to preform actions (they are functions)

    String customerName;
    int customerSSN;
    String city;
    double customerBalance = 0;

    static double totalBalance = 0;


    public BankAccount(String customerName, int customerSSN) {
        this.customerName = customerName;
        this.customerSSN = customerSSN;
    }

    // Constructor Overloading
    public BankAccount(String customerName, int customerSSN, String city) {
        this.customerName = customerName;
        this.customerSSN = customerSSN;
        this.city = city;
    }



    public void deposit(double moneyToDeposit) {
        customerBalance += moneyToDeposit;
        totalBalance += moneyToDeposit;
    }

    public void withdraw(double moneyToWithdraw) {
        customerBalance -= moneyToWithdraw;
        totalBalance -= moneyToWithdraw;
    }

}
