package homeworkAll.homework08;

/**
 * JavaAdvanced
 * 26.07.20 17: 17
 */
public class Booking {
    Person person;
    Room room;
    Date start;
    Date end;

    public Booking(Person person, Room room, Date start, Date end) {
        this.person = person;
        this.room = room;
        this.start = start;
        this.end = end;
    }

    public Person getPerson() {
        return person;
    }

    public Room getRoom() {
        return room;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }

    public String printAll() {
        return "Booking: " +
                "person=" + person +
                ", room=" + room +
                ", start=" + start +
                ", end=" + end;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "person=" + person +
                ", room=" + room +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}
