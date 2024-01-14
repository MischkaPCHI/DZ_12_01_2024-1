import java.util.Comparator;

public class SortCurrencyCode implements Comparator<Transaction> {

    @Override
    public int compare(Transaction o1, Transaction o2) {
        int currency = o1.getCurrencyCode().compareTo(o2.getCurrencyCode());
        if (currency==0){
            return (int) (o2.getAmount()- o1.getAmount());
        }
        return currency;
    }
}
