package Basic;

public class Thread2Impl {

    public static void main(String[] args){
        Thread2 t2 = new Thread2();
        t2.start();
        System.out.println("The current thread is : "+ Thread.currentThread().getName());
    }

}
