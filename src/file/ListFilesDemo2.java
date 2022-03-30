package file;
import java.io.File;
import java.io.FileFilter;
public class ListFilesDemo2{
    /**
     * filter
     * 有条件的获取一个目录中的子项
     *
     * File有一个重载的ListFiles方法,允许我们传入一个文件过滤器,并在该过滤器上定义过滤
     *条件,之后ListFiles执行完毕后会将目录中所有满足过滤器要求的子项进行返回
     */
    public static void main(String[] args)  {















//        File file = new File(".");
//        if(file.isDirectory()){
//            FileFilter f = new FileFilter(){
//                @Override
//                public boolean accept(File e) {
//                    return e.getName().contains("o");
//                }
//            };
//            File[] files = file.listFiles(f);
//            for(int i = 0; i < files.length; i++){
//                System.out.println(files[i]);
//            }
//        }else{
//            System.out.println("no exist");
//        }
//
//        //获取当前目录中名字里含有字母"o"的子项
//        File file = new File(".");
//        if(file.isDirectory()){
//            FileFilter f = new FileFilter(){
//                @Override
//                public boolean accept(File file1) {
//                    return file1.getName().contains("o");
//                }
//            };
//            File[] file1 = file.listFiles(f);
//            for(int i = 0; i < file1.length; i++){
//                System.out.println(file1[i]);
//            }
//        }else{
//            System.out.println("no exist");
//        }

//        File dir = new File(".");
//        if(dir.isDirectory()){
//            FileFilter filter = new FileFilter(){
//                public boolean accept(File file){
//                    return file.getName().contains("o");
//                }
//            };
//            File[] subs = dir.listFiles(filter);
//            System.out.println("共:" + subs.length + "个子项");
//            for(int i = 0; i < dir.length(); i++){
//                File sub = subs[i];
//                System.out.println(sub.getName());
//            }
//        }else{
//            System.out.println("n");
//        }
//        File file = new File(".");
//        if(file.isDirectory()){
//            FileFilter f = new FileFilter(){
//                @Override
//                public boolean accept(File file) {
//                    System.out.println(file.getName());
//                    return file.getName().contains("o");
//                }
//            };
//            File[] files = file.listFiles(f);
//            for(int i = 0; i < files.length; i++){
//                System.out.println(files[i]);
//            }
//        }else{
//            System.out.println("not exist");
//        }


























    }
}
