package thread;

/**
 * 同步块
 * 同步块可以更准确的锁定需要同步执行的代码片段,有效地缩小排队范围,可以在保证安全的前提下,
 * 尽可能的提高并发效率
 * 语法:
 * synchronized(同步监视器对象)
 * {
 * 需要多个线程同步执行的代码片段
 *   }
 *
 *   同步执行:多个线程执行时有先后顺序
 */
public class SyncDemo2 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Thread t1 = new Thread(){
            public void run(){
                shop.buy();
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                shop.buy();
            }
        };
        t1.start();
        t2.start();
    }
}
class Shop{
    public void buy(){

        try {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + ":正在挑衣服");
            Thread.sleep(5000);
            synchronized(this){
                System.out.println(t.getName() + ":正在试衣服");
                Thread.sleep(5000);
            }


            System.out.println(t.getName() + ":结账离开");
        } catch (InterruptedException e) {
        }
    }
}
