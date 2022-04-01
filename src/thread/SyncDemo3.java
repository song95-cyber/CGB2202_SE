package thread;

/**
 * 静态方法上如果使用synchronized, 那么该方法一定是同步的.
 *
 */
public class SyncDemo3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
          public void run(){
              Boo.dosome();
          }
        };
        Thread t2 = new Thread(){
            public void run(){
                Boo.dosome();
            }
        };
        t1.start();
        t2.start();

    }
}
class Boo{
    public static void dosome(){
        synchronized(Boo.class ){
        try{
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + ":is running");
            Thread.sleep(5000);
            System.out.println(t.getName() + "finish");
        }catch(InterruptedException e){

        }

        }
    }

}
