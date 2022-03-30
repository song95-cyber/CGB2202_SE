package file;

import java.io.File;
import java.io.IOException;

public class Mkdir2 {
    Mkdir2() throws IOException {
        File file2 = new File("./vir/vi");
        if(file2.exists()){
            System.out.println("exists");
        }else{
            file2.createNewFile();
            System.out.println("finish either~");
        }
    }
}
