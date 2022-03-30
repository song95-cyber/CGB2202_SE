package io;

import java.io.*;

/**
 * 缓冲字符输入流
 * java.io.BufferedReader
 * 块读文本数据加速,并且可以按行读取字符串
 */
public class BRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./src/io/BRDemo.java");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }

        br.close();
        /*
        BufferedReader提佛那个了一个读取一行字符串的方法:
        String readLine()
        该方法会连续读取若干字符,当遇到换行符停止,
        然后将换行符之前的内容以一个字符串形式返回
        注:这是内存操作,因为第一次调用readLine时,
        缓冲流会将数据先一次性读取到内部的char数组中(8k的字符),
        然后返回内部的一行字符串,如果流读取到了末尾,会返回null
         */


    }
}
