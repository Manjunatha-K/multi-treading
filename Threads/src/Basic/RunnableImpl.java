package Basic;

public class RunnableImpl {
    public static void main(String[] args){
        RunnableThread obj = new RunnableThread();
        Thread t1 = new Thread(obj);
        t1.start();
        System.out.println("The current Thread is : "+Thread.currentThread().getName());
    }
}
