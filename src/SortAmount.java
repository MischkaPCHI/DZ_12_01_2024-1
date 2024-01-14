import java.util.Comparator;

public class SortAmount implements Comparator<Transaction> {
    @Override
    public int compare(Transaction o1, Transaction o2) {
        return (int) (o2.getAmount() - o1.getAmount());
    }
}
