package io;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 使用文件输入流读取文件数据
 */
public class FISDemo {
    public static void main(String[] args) throws IOException {
        //将fos.dat文件中的数据读取回来
        FileInputStream fis = new FileInputStream("./fos.dat");
        /*
        int read()
        读取一个字节,并以int型返回,返回的int值对应的2进制的低八位为读取到的字节数据.如果返回值为int的-1则表示读取到了流的末尾
        fos.dat
        00000001 00000010
        int d = fis.read();
        d的2进制的样子:
        00000000 00000000 00000000 00000001
        -------------补24个0--------读取的字节
         */
        int d = fis.read();//第一次读取
        System.out.println(d);

        d = fis.read();//第二次读取
        System.out.println(d);

        d = fis.read();//第三次读取
        System.out.println(d);
    }
}
