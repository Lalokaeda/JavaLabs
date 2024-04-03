package lr8.task1.example3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Example3 {
    public static void main(String[] args) {
        String fileName = "D:/JavaProj/JavaApp/src/lr8/task1/example3/ByteReadFile.txt";
        InputStream inFile = null;

        try {
            inFile = new FileInputStream(fileName);
            FileByteReadSamBuff.readAllByArray(inFile);
        } catch (IOException e){
            System.out.println("Ошибка открытия-закрытия файла "+ fileName + e);
        } finally {
            if (inFile != null){
                try {
                    inFile.close();
                } catch (IOException ignore) {

                }
            }
        }
    }
}
