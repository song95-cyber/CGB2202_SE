package io;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Quick {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./ee.png");
        FileOutputStream fos = new FileOutputStream("./ee.png");
        byte[] data = new byte[1024 * 8];
        int len;//每次读取到的字节数

        long start = System.currentTimeMillis();
        while((len = fis.read(data)) != -1){
            //fos.write(data);
            fos.write(data,0,len);
        }
        long end = System.currentTimeMillis();
        System.out.println("waste" + (end - start) + "ms");
        fos.close();
        fis.close();
    }
}
