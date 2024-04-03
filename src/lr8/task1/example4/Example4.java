package lr8.task1.example4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Example4 {

    public static void main(String[] args) {
        try {
            File fl = new File("D:\\JavaProj\\JavaApp\\src\\lr8\\task1\\example4\\My\\numIsh.txt");
            fl.createNewFile();
            Scanner sc = new Scanner(System.in, "cp1251");
            DataOutputStream wr = new DataOutputStream(new FileOutputStream(fl.getAbsolutePath()));
            System.out.println("Сколько вещественных чисел записать в файл?");
            int count = sc.nextInt();
            System.out.println("Введите числа: ");
            for (int i = 0; i < count; i++) {
                wr.writeFloat(sc.nextFloat());
            }
            wr.flush();
            wr.close();

            File fl2 = new File("D:\\JavaProj\\JavaApp\\src\\lr8\\task1\\example4\\My\\numRez.txt");
            fl2.createNewFile();

            DataInputStream rd = new DataInputStream(new FileInputStream(fl.getAbsolutePath()));
            wr = new DataOutputStream(new FileOutputStream(fl2.getAbsolutePath()));
            try {
                while (true) {
                    float number = rd.readFloat();
                    wr.writeFloat(number);
                    System.out.println(" Число " + (float) number);
                }
            } catch (EOFException e) {
            }
            wr.flush();
            wr.close();
            rd.close();
        } catch (IOException e) {
            System.out.println("End of file");
        }
    }
}
