package lr8.task1.example2;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import lr8.task1.example2.FileReader;

public class Example2 {

    public static void main(String[] args) throws IOException{
        
        try{
            //TODO поменять патч
            InputStream inFile = new FileInputStream("D:/JavaProj/JavaApp/src/lr8/task1/example2/text.txt");
            FileReader.readAllByByte(inFile);
            System.out.print("\n\n\n");
            inFile.close();

            InputStream inUrl = new URL("https://google.com").openStream();
            FileReader.readAllByByte(inUrl);
            System.out.print("\n\n\n");
            inFile.close();
            
            InputStream inArray = new ByteArrayInputStream(new byte[] {7, 9, 3, 7, 4});
            FileReader.readAllByByte(inArray);
            System.out.print("\n\n\n");
            inFile.close();
        } catch (IOException e){
            System.out.println("Ошибка: "+e);
        }
    }
}
