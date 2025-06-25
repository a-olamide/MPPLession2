package lesson4.open_closed_principle;

public abstract class Account {
    private String accountNumber;
    private double balance;
    private String ownerName;

    public Account(String accountNumber, double balance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    public abstract double getBalance();
}
