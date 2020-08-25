package lesson22LinkedList;

/**
 * JavaAdvanced
 * 20.08.20 19: 54
 */
public class Node {
    private Node next;
    private Node prev;
    private Person person;

    public Node(Person person) {
        this.person = person;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }

    public Person getPerson() {
        return person;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
