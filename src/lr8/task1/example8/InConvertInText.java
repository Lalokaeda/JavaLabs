package lr8.task1.example8;

import java.io.IOException;
import java.io.Reader;

public class InConvertInText {
    public static void readAllByByte(Reader in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) { 
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + " конец ");
                break;
            }
        }
    }
}
