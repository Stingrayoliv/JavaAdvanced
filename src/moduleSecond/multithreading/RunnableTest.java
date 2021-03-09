package moduleSecond.multithreading;

public class RunnableTest implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello from Runnable"+Thread.currentThread().getName());
    }
}
