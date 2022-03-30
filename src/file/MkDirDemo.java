package file;
import java.io.File;
/**
 * directory:目录
 * make:做
 * 使用File创建一个目录
 * 注:mkdir是linux中的一条命令.就是make directory 的简写,意思是创建目录
 *
 */
public class MkDirDemo {
     public void MkDirDemo(){
         File file1 = new File("./.d.df.b.c.b.n.m.vir");
         if(file1.exists()){
             System.out.println("exists");
         }else{
             file1.mkdirs();
             System.out.println("finish");
         }
     }















    }

//在当前目录下创建一个目录:demo
//        File dir = new File("./demo");
//        if(dir.exists()){
//            System.out.println("exists");
//        }else{
//            dir.mkdir();
//            System.out.println("ok");