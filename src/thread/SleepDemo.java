package thread;

import java.util.Scanner;

/**
 * sleep阻塞
 * 线程提供了一个静态方法sleep,可以使运行该方法的线程阻塞指定毫秒,超时后线程会自动回到
 * RUNNABLE状态继续并发运行
 */
public class SleepDemo {
    public static void main(String[] args) {

          System.out.println("please input second number:->");
        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt() * 1000;

        for(int  num = scan.nextInt(); num > 0; num--){
            System.out.println(num);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
              }
        }
        System.out.println("end");
    }
}
