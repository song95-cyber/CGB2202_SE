package thread;

/**
 * java中所有的代码都是靠线程运行的,main方法也不例外
 * java程序跑起来后,JVM会创建一条线程来执行main方法,这个现成的名字也叫main,
 * 我们通常称呼他为"主线程"
 */
public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();//用于获取执行当前方法的线程
        System.out.println("主线程为" + main);
        dosome();//主线程调用dosome方法
    }
    public static void dosome(){
        Thread t = Thread.currentThread();
        System.out.println("执行dosome方法的线程是:" + t);
    }
}

