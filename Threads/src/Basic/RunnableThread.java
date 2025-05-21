package Basic;

public class RunnableThread implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(500);
            Thread.currentThread().setName("MyThread");
            System.out.println("The Thread is : "+ Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
