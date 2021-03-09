package moduleSecond.multithreading;

public class Conter {
    private int counter=0;

    public synchronized void increment(){
        counter++;
    }

    public synchronized void decrement(){
        counter--;
    }


    @Override
    public String toString() {
        return "Conter{" +
                "counter=" + counter +
                '}';
    }
}
