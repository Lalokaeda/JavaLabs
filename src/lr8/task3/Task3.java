package lr8.task3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                                            new InputStreamReader(
                                                new FileInputStream("src\\lr8\\task3\\text.txt"), "utf8"));
        BufferedWriter out = new BufferedWriter(
                                new OutputStreamWriter(
                                    new FileOutputStream("src\\lr8\\task3\\result.txt"), "Cp1251"));
        int lineCount = 0;
        String s;
        String sogl = "бвгджзйклмнпрстфхцчшщъь";
        try {
            while ((s = bufferedReader.readLine()) != null) {
                lineCount++;
                String[] resStr = s.split(" ");
                StringBuilder sb = new StringBuilder();
                int wordsCount = 0;
                for (String string : resStr) {
                    if (sogl.contains(string.substring(0, 1).toLowerCase())) {
                        wordsCount++;
                        sb.append(string.replaceAll("(?U)[\\pP\\s]", "") + " ");
                    }
                }
                byte[] str = (lineCount + " строка: " + sb.toString() + "- Всего слов: " + wordsCount).getBytes("cp1251");
                System.out.println(new String(str, "Cp1251"));
                out.write(new String(str, "Cp1251"));
                out.newLine();
            }

        } catch (IOException e) {
            System.out.println("ОШИБКА");
        } finally {
            bufferedReader.close();
            out.flush();
            out.close();
        }
    }
}
