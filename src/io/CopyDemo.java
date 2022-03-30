package io;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./ee.png");
        FileOutputStream fos =new FileOutputStream("./ee_copy.png");
        int d;
        while((d = fis.read()) != -1){
            fos.write(d);
        }
        System.out.println("right");






















//
//        FileInputStream f = new FileInputStream("./ee.png");
//        FileOutputStream fos = new FileOutputStream("./ee_copy.png");
//        int d;
//        while((d = f.read()) != -1){
//            fos.write(d);
//        }
//        System.out.println("right");

        //        FileInputStream fis = new FileInputStream("ee.png");
//        FileOutputStream fos = new FileOutputStream("ee_copy.png");
//        int d;
//        while((d = fis.read()) != -1){
//            fos.write(d);
//        }
//        System.out.println("right");







    }
}
