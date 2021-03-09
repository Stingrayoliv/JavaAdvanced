package moduleSecond.multithreading;

public class IncrementThread implements Runnable{
    private Conter counter;
    public IncrementThread(Conter counter){
        this.counter=counter;
    }
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            counter.increment();
        }
    }
}
