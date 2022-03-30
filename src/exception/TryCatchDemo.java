package exception;

/**
 * java的异常处理机制
 * java中所有异常的超类为Throwable,其下派生了两个子类:Error和Exception
 * Error表示系统错误,通常是不能在程序运行期间被解决的错误
 * Exception表示程序级别的错误,通常是有序逻辑等导致的问题,可以在程序运行期间被解决
 *
 * 异常处理机制中的try-catch
 * 语法:
 * try{
 *     可能出现异常的代码片段
 * }catch(xxxxException e){
 *     try语句块中出现xxxxException后的解决办法
 * }
 */
public class TryCatchDemo {
    public static void main(String[] args){
             System.out.println("begin");
             try {
                     String line = "f";
             /*
             JVM执行到这里时如果发生了异常就会实例化一个对饮的异常实例,
             并将程序执行过程设置进去,然后将异常抛出
              */
                     System.out.println(line.length());
                     System.out.println(line.charAt(0));
                     System.out.println(Integer.parseInt(line));
             }catch(NullPointerException|StringIndexOutOfBoundsException e){
                     System.out.println("exceptions");/*将两种异常合并,需要用"|"(或) */
                     //可以在最后一个catch处捕获Exception,避免因为捕获的异常导致程序中断
             }catch(Exception ee){
                     System.out.println("have an unknown exception");
             }

             //如果两种异常处理方法不一样,就用下面这种
//             }catch(NullPointerException e){
//                     //当try中出现空指针后的解决办法
//                     System.out.println("exception");
//             }catch(StringIndexOutOfBoundsException f){
//                     System.out.println("exception2");
//             }

            System.out.println("end");
    }
}
