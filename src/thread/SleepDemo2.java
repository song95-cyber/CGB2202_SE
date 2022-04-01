package thread;

/**
 * 当一个线程调用sleep方法处于睡眠阻塞的过程中其interrupt()方法被调用,
 * 那么这时会中断该睡眠阻塞,并且sleep 方法会抛出中断异常
 */
public class SleepDemo2 {
    public static void main(String[] args){
        Thread l = new Thread(){
           public void run(){
               System.out.println("sleep");
               try {
                   Thread.sleep(50000);
               } catch (InterruptedException e) {
                   System.out.println("fuck");
               }
               System.out.println("wake");
           }
        };
        Thread h = new Thread(){
          public void run (){
              System.out.println("hia~ hia~");
              try {
                  Thread.sleep(4000);
              } catch (InterruptedException e) {
              }
              l.interrupt();//中断l线程(如果线程处于睡眠阻塞,则是终端该阻塞状态)
              System.out.println("Oh~ sorry");
          }
        };
        l.start();
        h.start();
    }
}


