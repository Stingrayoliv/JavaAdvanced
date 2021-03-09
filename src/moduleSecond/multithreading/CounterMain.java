package moduleSecond.multithreading;

public class CounterMain {
    public static void main(String[] args) throws Exception {
        Conter counter=new Conter();
        Thread increment = new Thread(new IncrementThread( counter ));
        Thread decrement = new Thread(new DecrementThread( counter ));

        increment.start();
        decrement.start();

        decrement.join();
        increment.join();

        System.out.println(counter);
    }
}
