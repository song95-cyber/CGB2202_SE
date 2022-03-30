package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 从文件中读取文本数据
 */
public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./Demo.txt");
        byte[] data = new byte[1024 * 10];
        int len = fis.read(data);
        System.out.println(len);

        String line = new String(data,0,len, StandardCharsets.UTF_8);
        System.out.println(line.length());
        System.out.println(line);

    }
}
