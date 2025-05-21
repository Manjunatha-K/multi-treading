package Advanced;

public class JoinClass {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 =new Thread(()->{
            try {
                Thread.sleep(1000);
                Thread.currentThread().setName("T1-Thread");
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 =new Thread(()->{
            try {
                Thread.sleep(1500);
                Thread.currentThread().setName("T2-Thread");
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("The main Thread");
    }
}
