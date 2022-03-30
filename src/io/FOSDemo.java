package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/** JAVA  IO java 的输入与输出
 * java使用输入与输出的两个方向来规定读和写操作
 * 其中输入时从外界到我们写的程序的方向是获取的过程,是[读取]操作
 * 二输出则是发送到外界的方向,是[写出]操作
 *
 * java将IO比喻为'流',我们可以理解为是链接我们写的程序与外界设备之间的"管道",类似显示生活中的"水管",只不过这个管子里流的不是水,而是[字节]
 *
 * java.io.InputStream和OutputStream是所有字节输入流与输出流的超类,他们是抽象类
 * InputStream定义了读取字节的相关方法,OutputStream定义了写出字节的相关方法
 * 实际开发中我们可以创建不同种类的输入与输出流来链接对应的设备进行读写操作
 *
 * 文件流
 * java.io.FileInputStream和FileOutStream.他们继承自InputStream和OutputStream是实际用于读写文件的流
 *
 */
public class FOSDemo {
    public static void main(String[] args) throws IOException {

        //向文件fos.dat中写入一个字节
        /*
        文件输出流常用的构造方法:
        FileOutputStream(String path)
        FileOutputStream(File file)
         */
        FileOutputStream fos = new FileOutputStream("./fos.dat");
        /*
        void write(int d)
        写出一个字节,写出的内容是给定的int值对应的2进制的"低八位"
        fos.write(1);
        int型整数1的2进制            vvvvvvvv
        00000000 00000000 00000000 00000001
        dos.dat文件中的内容:
        00000001
         */
        fos.write(1);
        /*
        fos.write(2);
        int型整数2的2进制
        00000000 00000000 00000000 00000010
        fos.dat文件中的内容
        00000001 00000010
         */
        fos.write(4);
        System.out.println("写出完毕");
        //fos.close();写操作最终完毕后要关闭流!
    }

}
