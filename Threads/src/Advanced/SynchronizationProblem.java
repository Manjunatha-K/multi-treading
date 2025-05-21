package Advanced;

public class SynchronizationProblem {

    private static Integer counter1 = 0;
    private static Integer counter2  = 0;

    private static synchronized  void increment1(){
        ++counter1;
    }

    private static synchronized  void increment2(){
        ++counter2;
    }

    public static void main(String[] args){
        Thread t1 = new Thread(()->{
          for(int i =0;i<1000;i++) {
              increment1();
          }
        });

        Thread t2 = new Thread(()->{
            for(int i =0;i<1000;i++) {
                increment2();
            }
        });
        System.out.println(counter1);
        System.out.println(counter2);

    }

}
