package io;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
         FileInputStream e= new FileInputStream("./text.txt");
         int d = 0;
        for(int i = 0; i < 27; i++){
            d = e.read();
            d += 1;
            System.out.print(d + " ");
        }
    }
}
