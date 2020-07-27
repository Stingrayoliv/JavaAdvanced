package lesson09;

/**
 * JavaAdvanced
 * 27.07.20 19: 23
 */
public abstract class Card {
    private Person person;
    private String number;

    public Card(Person person, String number) {
        this.person = person;
        this.number = number;
    }

    public Person getPerson() {
        return person;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Card{" +
                "person=" + person +
                ", number='" + number + '\'' +
                '}';
    }

    public abstract String toSecureString();

}


