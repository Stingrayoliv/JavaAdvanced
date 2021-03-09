package moduleSecond.multithreading;

public class TestThread extends Thread{

    public void run(){
        System.out.println("Hello from test Thread "+Thread.currentThread().getName());
    }
}
