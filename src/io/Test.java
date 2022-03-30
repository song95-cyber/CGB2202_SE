package io;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("text.txt");
        for(int i = 97; i < 123; i++){
            fos.write(i);
        }
        System.out.println("写出完毕");
    }
}
