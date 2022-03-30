package file;
import java.io.File;
/**
 * 使用File访问一个目录中的子项
 */
public class ListFilesDemo {
    public static void main(String[] args) {
        //查看当前目录下的所有子项
        File dir = new File(".");//当前目录
        /*
        boolean isFile()
        判断当前File表示的是否为一个文件
        Boolean isDirectory()
        判断当前File表示的是否为一个目录
         */
        if(dir.isDirectory()){
            File[] subs = dir.listFiles();
            System.out.println("当前目录中共包含" + subs.length + "个");
            for(int i = 0; i < subs.length; i++){
                System.out.println(subs[i]);
            }
        }

        File file2 = new File("./src/file");

        if(file2.isDirectory()){
            File[] sub1 = file2.listFiles();
            for(int i = 0; i < sub1.length; i++){
                System.out.println(sub1[i]);
            }
        }
    }
}
