package thread;

/**
 * 互斥锁
 * 当使用多个synchronized锁定多个代码片段,并且指定的锁对象都相同时,这些代码片段就是
 * 互斥的,即多个线程不能同时执行他们
 */
public class SyncDemo4 {
    public static void main(String[] args) {
        Foo foo1 = new Foo();
        Foo foo2= new Foo();
    //    Foo foo = new Foo();
        Thread t1 = new Thread(){
            public void run(){
                foo1.methodA();
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                foo2.methodB();
            }
        };
        t1.start();
        t2.start();
    }
}
class Foo{
    public synchronized void methodA(){
        try {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + ":正在执行A方法");
            Thread.sleep(5000);
            System.out.println(t.getName() + ":执行A方法完毕");
        }catch(InterruptedException e){
        }
    }
    public  void methodB(){
      //  synchronized(this){
        synchronized(Foo.class){
            try {
                Thread t = Thread.currentThread();
                System.out.println(t.getName() + ":正在执行B方法");
                Thread.sleep(5000);
                System.out.println(t.getName() + ":执行B方法完毕");
            }catch(InterruptedException e){
            }
        }

    }
}






