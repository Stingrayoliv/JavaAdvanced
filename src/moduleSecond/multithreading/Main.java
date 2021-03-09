package moduleSecond.multithreading;

public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread=Thread.currentThread();
        thread.setName( "Test Thread" );

        String name = thread.getName();

        System.out.println("Hello world "+name);

        Thread testThread = new TestThread();
        testThread.start();
        Thread.sleep( 100 );
        System.out.println("Good bye");

        RunnableTest runnableTest = new RunnableTest();
        Thread runnableThread=new Thread(runnableTest);
        runnableThread.start();

        Runnable runnable=()->{
            System.out.println("Hello from Runable Lambda "+Thread.currentThread().getName());
        };

        Thread thread1=new Thread(runnable);
        thread1.start();
    }
}
