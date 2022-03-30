package io;

import java.io.*;
import java.util.Scanner;
/**
 * 自行完成流连接创建PrintWriter
 *
 * 简易记事本工具
 * 程序启动后,将用户在控制台上输入的每一行字符串都按行写入到文件note.txt中
 * 单独输入exit时,程序退出
 */
public class PWDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        String input;
        FileOutputStream fos = new FileOutputStream("./pw3.txt",true);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        /*
        PrintWriter提供的构造方法中如果第一个蚕食是一个流,那么就可以在传入一个Boolean值的参数用于指定是否打开自动行刷新功能(默认是false不打开)
        当该值为TRUE时就打开了自动行刷新功能,
        每当我们调用println方法,写出一行字符串后就会自动flush一次.
         */
        PrintWriter pw = new PrintWriter(bw,true);
        while(true) {
            String line = scan.nextLine();
            if (("exit".equalsIgnoreCase(line) && line.length() == 4)) {
                break;
            }
            pw.println(line);
        }
        System.out.println("bye");
    }
}
//        while(((("exit").equals(scan.next()) && ((scan.next()).length() == 4)) != true)){
//            pw.println(scan.next());
//            System.out.println("ok");
//        }
//        pw.close();