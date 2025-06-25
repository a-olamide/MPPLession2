package lesson4.open_closed_principle;

public class CheckingAccount extends Account {
    private double overdraftLimit;
    private double monthlyFee;
    private String debitCardNumber;

    public CheckingAccount(String accountNumber, double balance, String ownerName, double overdraftLimit, double monthlyFee,
                           String debitCardNumber) {
        super(accountNumber, balance, ownerName);
        this.overdraftLimit = overdraftLimit;
        this.monthlyFee = monthlyFee;
        this.debitCardNumber = debitCardNumber;

    }

    @Override
    public double getBalance() {
        return 0;
    }
}
