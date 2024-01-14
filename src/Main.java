import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Account debit1 = new Account(new Person("Jack","Smith"), "DE878454987");
        Account debit2 = new Account(new Person("John","Smith"), "DE878454987");
        Account debit3 = new Account(new Person("Raf","Eser"), "DE878454987");
        Account credit1 = new Account(new Person("Lena", "Becker"),"USD8476546876");
        Account credit2 = new Account(new Person("Miko", "Nakadi"),"USD8476546876");
        Account credit3 = new Account(new Person("Itachi", "Utchiha"),"USD8476546876");

        List<Transaction> transactions = new ArrayList<>();

        transactions.add(new Transaction(debit1,credit1,1500,"EUR"));
        transactions.add(new Transaction(debit2,credit2,2000,"USD"));
        transactions.add(new Transaction(debit3,credit3,1000,"GPB"));
        transactions.add(new Transaction(debit1,credit2,500,"EUR"));
        transactions.add(new Transaction(debit2,credit3,100,"USD"));
        transactions.add(new Transaction(debit3,credit1,1200,"GPB"));

        Collections.sort(transactions,new SortID());

        List<Transaction> copyList = new ArrayList<>(transactions);

        System.out.println(copyList);

        Collections.sort(copyList,new SortAmount());

        System.out.println(copyList);

        Collections.sort(copyList,new SortCurrencyCode());
        System.out.println(copyList);

    }
}