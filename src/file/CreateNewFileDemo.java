package file;
import java.io.File;
import java.io.IOException;

/**
 * create:创建
 * 使用File新建一个文件
 */
//public class CreateNewFileDemo {
//    public static void main(String[] args) throws IOException {
//        //在当前签项目目录下新建一个文件:test.txt
//        File file = new File("./test.txt");
//        //boolean exist() 判断file对应的路径是否存在该文件或目录
//        // 创建文件的前提是该文件所在的目录必须存在,如果目录不存在则创建时会抛出异常:
//        //            //java.io.I0Exception:系统找不到指定的路径
//        //            File files = new File("./dfdf/test.txt");
//        //
//        if(file.exists()){
//            //存在
//            System.out.println("exists");
//        }else{
//            //不存在
//            file.createNewFile();
//
//        }
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//    class Aoo{
//        File file1 = new File("./sss.exe");
//
//    }
//}