package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ISRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("osw.txt");
        InputStreamReader sir = new InputStreamReader(fis, StandardCharsets.UTF_8);
        /*
        字符流的:
        int read();
        读取一个字符,将对应的char值存入返回的int值的"低十六位"上
        00000000  00000000 10101010 10101010
        如果返回的int值为-1,表示读取到了末尾
         */
        int d;
        while((d = sir.read()) != -1){
            System.out.print((char)d);

        }
        sir.close();
    }
}
