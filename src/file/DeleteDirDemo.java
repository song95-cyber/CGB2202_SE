package file;
import java.io.File;
/**
 * 删除一个目录
 */
public class DeleteDirDemo {
    public static void main(String[] args) {
        //将当前目录下的demo目录删除
        File dir = new File("./demo");
        if(dir.exists()){
            System.out.println("exists");
            dir.delete();
        }else{
            System.out.println("no");
        }
    }
}
