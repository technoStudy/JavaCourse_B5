package Day28.Homework.Task1;

public class Account {

    private String userId;
    private double balance;

    public Account(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
     return userId;
    }

    // getter - balance - to access private field(read or get)
    public double getBalance() {
        return balance;
    }

    // setter - balance - to access private field (assign or update)
    public void setBalance(double balance) {
        if (balance < 0)
            throw new IllegalArgumentException("Balance cannot be less than 0");
        this.balance = balance;
    }

}
