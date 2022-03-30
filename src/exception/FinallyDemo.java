package exception;

/**
 * 异常处理机制中的finally块
 * finally块是异常处理机制中的最后一块,他可以跟在try之后或者最后一个catch之后
 * finally可以保证只要程序执行到太try语句块中,无论try中是否出现异常,finally最终都会必定执行]
 * 通常我们将释放资源这类操作放在finally中确保运行,例如IO操作后最终的close()调用
 */
public class FinallyDemo {
    public static void main(String[] args){
        System.out.println("begin");
        try{
            String line = null;
            System.out.println(line.length());
            //try语句块中出错代码以下的内容都不执行
            System.out.println("!!!!");
        }catch(Exception e){
            System.out.println("wrong");
        }finally{
            System.out.println("finally");//就算try中有return,finally中的代码也会被执行
        }
        System.out.println("程序结束");
    }
}
