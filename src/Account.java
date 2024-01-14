public class Account {
    private Person owner;
    private String iban;

    public Account(Person owner, String iban) {
        this.owner = owner;
        this.iban = iban;
    }
    @Override
    public String toString() {
        return "Account{" +
                "owner=" + owner +
                ", iban='" + iban + '\'' +
                '}';
    }
}
