package javaapp.lr8.task2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Task2 {
    public static void main(String[] args) throws IOException {
        CreateFile.Create(3);
        String inputFileName = CreateFile.getPath();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
                                            new FileInputStream(inputFileName), "cp1251"));
        PrintWriter out = new PrintWriter("D:\\JavaProj\\JavaApp\\src\\main\\java\\javaapp\\lr8\\task2\\outfile.txt");
        int lineCount = 0;
        String s;
        try {
            while ((s = bufferedReader.readLine()) != null) {
                lineCount++;
                if (lineCount == 2) {
                    out.println(s);
                }
                if (lineCount == 3) {
                    String[] s1 = s.split(" ");
                    double[] nums = new double[5];
                    int i = 0;
                    for (String string : s1) {
                        nums[i] = Double.parseDouble(string);
                        i++;
                    }
                    for (double num : nums) {
                        if (num > 0) {
                            out.print(num);
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!" + e);
        } finally {
            bufferedReader.close();
            out.flush();
            out.close();
        }
    }
}
