package Hotel;

/**
 * JavaAdvanced
 * 31.07.20 19: 38
 */
public class Booking {
    static private int nextId = 0;// статическое поле: 1-ый букинг=1, создали 2-ой, то будет букинг=2
    private int id;
    private Room room;
    private Person person;
    private DateInterval dateInterval;

    public Booking(Room room, Person person, DateInterval dateInterval) {
        this.room = room;
        this.person = person;
        this.dateInterval = dateInterval;
        this.id=++nextId; //когда мы вызываем создание букинга, то увеличивается значения ИД
        // ++nextId - сначала прибавим, потом сохраним
    }

    public Room getRoom() {
        return room;
    }

    public Person getPerson() {
        return person;
    }

    public DateInterval getDateInterval() {
        return dateInterval;
    }

    public double getPrice() {
        return this.room.getPrice() * this.dateInterval.getDays();
    }

    @Override
    public String toString() {
        return "(" + id + ")" + "Booking: " + room +
                ", person=" + person + " " + dateInterval + "\n\tprice for " + this.dateInterval.getDays() +
                " days is " + getPrice() + " Euro";
    }
}
