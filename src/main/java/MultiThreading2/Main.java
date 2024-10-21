package MultiThreading2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Going inside the main method: " + Thread.currentThread().getName());
        MultiThreadingLearning runnableObj = new MultiThreadingLearning();
        Thread thread = new Thread(runnableObj);

        thread.start();
        System.out.println("Finish the main method: " + Thread.currentThread().getName());

    }
}