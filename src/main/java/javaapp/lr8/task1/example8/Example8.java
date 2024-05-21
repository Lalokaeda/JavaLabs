package javaapp.lr8.task1.example8;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class Example8 {

    public static void main(String[] args) {
        try {
            InputStream inFile = new FileInputStream("D:\\JavaProj\\JavaApp\\src\\main\\java\\javaapp\\lr8\\task1\\example6\\MyFile1.txt");
            Reader rFile = new InputStreamReader(inFile, "utf8");
            InConvertInText.readAllByByte(rFile);
            System.out.print("\n\n\n");
            inFile.close();
            rFile.close();
            InputStream inUrl = new URL("http://google.com").openStream();
            Reader rUrl = new InputStreamReader(inUrl, "cp1251");
            InConvertInText.readAllByByte(rUrl);
            System.out.print("\n\n\n");
            inUrl.close();
            rUrl.close();
            InputStream inArray = new ByteArrayInputStream(new byte[] { 5, 8, 3, 9, 11 });
            Reader rArray = new InputStreamReader(inArray, "cp1251");
            InConvertInText.readAllByByte(rArray);
            System.out.print("\n\n\n");
            inArray.close();
            rArray.close();
        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}
