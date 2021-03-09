package moduleSecond.multithreading;

public class DecrementThread implements Runnable{
    private Conter counter;

    public DecrementThread(Conter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            counter.decrement();
        }
    }
}
