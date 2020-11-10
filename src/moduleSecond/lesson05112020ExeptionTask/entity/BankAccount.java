package moduleSecond.lesson05112020ExeptionTask.entity;

public class BankAccount {
    private String IBAN;

    public BankAccount(String bankAccount) {
        IBAN = bankAccount;
    }

    public String getIBAN() {
        return IBAN;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "BankAccount='" + IBAN + '\'' +
                '}';
    }
}
