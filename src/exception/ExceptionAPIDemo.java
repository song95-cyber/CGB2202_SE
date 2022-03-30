package exception;

/**
 * 异常中常用的API
 */
public class ExceptionAPIDemo {
    public static void main(String[] args) {
        System.out.println("begin");
        try{
            String str = "abc";
            System.out.println(Integer.parseInt(str));
        }catch(Exception e){
            e.printStackTrace();//输出错误信息有助于我们debug

            //获取错误信息,一般用于提示给用户或者记录日志的时候使用
            String message = e.getMessage();
            System.out.println(message);
            System.out.println("We have an error");
        }
        System.out.println("end");
    }
}
