import java.util.Comparator;

public class Transaction {
    private static int idCounter = 1;
    private int id;
    private Account accDebit;
    private Account accCredit;
    private double amount;
    private String currencyCode;

    public Transaction(Account accDebit, Account accCredit, double amount, String currencyCode) {
        this.id = idCounter++;
        this.accDebit = accDebit;
        this.accCredit = accCredit;
        this.amount = amount;
        this.currencyCode = currencyCode;
    }
    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", accDebit=" + accDebit +
                ", accCredit=" + accCredit +
                ", amount=" + amount +
                ", currencyCode='" + currencyCode + '\'' +
                "}\n";
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }
}
