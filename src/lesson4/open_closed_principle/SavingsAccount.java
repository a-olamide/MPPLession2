package lesson4.open_closed_principle;

public class SavingsAccount extends Account {
    private double interestRate;
    private int withdrawalLimit;
    private double minimumBalance;

    public SavingsAccount(String accountNumber, double balance, String ownerName, double interestRate, int withdrawalLimit,
                          double minimumBalance) {
        super(accountNumber, balance, ownerName);
        this.interestRate = interestRate;
        this.withdrawalLimit = withdrawalLimit;
        this.minimumBalance = minimumBalance;
    }

    @Override
    public double getBalance() {
        return 0;
    }
}
