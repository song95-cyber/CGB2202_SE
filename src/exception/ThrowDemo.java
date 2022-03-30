package exception;

/**
 * 异常的抛出
 * throw关键字可以主动对外抛出一个异常
 * 通常:
 * 1:程序出现了异常,但是该异常不应该在当前代码块中被解决时,可以主动将其抛出去
 * 2:程序可以运行,但是以不满足业务场景要求时可以当做异常抛出去
 */
public class ThrowDemo {
    public static void main(String[] args) {
        Person p = new Person();
        try {
            p.setAge(10000);        //满足语法但是不满足业务场景
            /*
            当我们调用一个含有throws声明异常抛出的方法是,编译器要求我们必须处理这个异常,否则编译不通过
            处理方式有两种:
            1:使用try-catch主动捕获并处理这个异常
            2:使用throws继续将该异常声明抛出
             */
        } catch (IllegalAgeException e) {
            e.printStackTrace();
        }
        System.out.println(p.getAge() + "years old");

        System.out.println("finish");
    }
}
