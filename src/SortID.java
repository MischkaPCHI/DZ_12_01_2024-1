import java.util.Comparator;

public class SortID implements Comparator<Transaction> {

    @Override
    public int compare(Transaction o1, Transaction o2) {
        return o2.getId()- o1.getId();
    }
}
