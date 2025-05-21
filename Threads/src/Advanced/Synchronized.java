package Advanced;

public class Synchronized {

    private static Integer counter = 0;

    private static synchronized void  increament() {
        ++counter;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                increament();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                increament();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("The counter value of the Threads is : " + counter);
    }

}
