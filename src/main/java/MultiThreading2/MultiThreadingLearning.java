package MultiThreading2;

public class MultiThreadingLearning implements Runnable{
    @Override
    public void run() {
        System.out.println("Code executed by thread: "+ Thread.currentThread().getName());
    }
}
