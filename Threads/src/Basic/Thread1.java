package Basic;

public class Thread1 extends Thread{

    public void run(){
        try {
            Thread.sleep(1000);
            Thread.currentThread().setName("CustomThread");
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public static void main(String[] args){
        Thread1 t1 = new Thread1();
        t1.start();
        System.out.println(Thread.currentThread().getName());
    }

}
