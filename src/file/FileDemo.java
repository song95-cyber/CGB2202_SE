package file;

import java.io.File;

public class FileDemo {
    public static void main(String[] args){
        /*
        实际开发中我们不会使用绝对路径,虽然清晰明了,但是不利于跨平台.

        相对路径有更好的跨平台性,但是具体位置要看程序运行环境而定
        例如:
        "./":当前目录,对于idea而言,该目录是当前程序所在的项目目录
         */
        File file = new File("./Demo.txt");
        String name = file.getName();
        System.out.println(name);
        String name1 = file.getName();
        long length = file.length();
        //获取大小,就是文件在硬盘上实际占用的空间(单位是字节)
        System.out.println("大小是" + length + "字节");
        boolean cw = file.canRead();
        boolean ds = file.canWrite();
        boolean d = file.isHidden();
        System.out.println(cw);
        System.out.println(ds);
        System.out.println(d);

    }






















    /**
     * java.io.File
     * File可以表示硬盘上的一个文件或目录(实际表示的是一个抽象路径)
     * File可以:
     * 1:访问其表示的文件或目录的属性信息(名字,大小,修改时间等等)
     * 2:可以创建或删除文件或目录
     * 3:可以访问一个目录中的子项内容
     * 但是File不能访问文件数据
     * */
}
