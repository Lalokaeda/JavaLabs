package javaapp.lr8.task1.example2;

import java.io.IOException;
import java.io.InputStream;

import org.xml.sax.InputSource;

public class FileReader {

    public static void readAllByByte(InputStream in) throws IOException{
        while(true){
            int oneByte = in.read();
            if (oneByte !=-1){
                System.out.print((char)oneByte);
            } 
            else {
                System.out.print("\n"+"end");
                break;
            }
        }
    }
}
