package javaapp.lr8.task1.example3;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class FileByteReadSamBuff {

    public static void readAllByArray(InputStream in) throws IOException {
        byte[] buff = new byte[5];
        while (true) {
            int count = in.read(buff);
            if (count != -1) {
                System.out.println("Количество = " + count + ", buff = "
                        + Arrays.toString(buff) + ", str = "
                        + new String(buff, 0, count, "cp1251"));
            } else {
                break;
            }
        }
    }

}
