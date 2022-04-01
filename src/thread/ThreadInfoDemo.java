package thread;

import java.sql.SQLOutput;

/**
 * 线程提供了一套获取相关信息的方法
 */
public class ThreadInfoDemo {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        String name = main.getName();//获取线程的名字
        System.out.println(name);

        long id = main.getId();//获取线程的唯一标识
        System.out.println(id);

        int priority = main.getPriority();//获取线程的优先级
        System.out.println(priority);

        //当前线程是否被中断
        boolean isInterrupted = main.isInterrupted();
        System.out.println("是否被中断:" + isInterrupted);
        //是否为守护线程
        boolean isDaemon = main.isDaemon();
        System.out.println("是否为守护线程:" + isDaemon);
        //是否活着
        boolean isAlive = main.isAlive();
        System.out.println("是否活着:" + isAlive);
    }
}
