package homeworkAll.homework10Bank;

/**
 * JavaAdvanced
 * 30.07.20 13: 17
 */
public class Account {
    private Private owner;
    private Corporate owner2;
    private String account;

    public Account(Private owner, String account) {
        this.owner = owner;
        this.account = account;
    }

    public Account(Corporate owner2, String account) {
        this.owner2 = owner2;
        this.account = account;
    }

    @Override
    public String toString() {
        if (owner == null) return "Account{ owner=" + owner2.getName() +
                ", account='" + account + '}';
        return "Account{ owner_name=" + owner.getName() + " owner_surname=" + owner.getSurname() +
                ", account='" + account + '}';

    }
}
