package lesson20200909BankAndArray;

public class Account {
    private Owner owner;
    private String iban;

    public Account(Owner owner, String iban) {
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
