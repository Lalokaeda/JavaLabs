package javaapp.lr8.task2;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
    private static String _fname = null;

    public static String getFname() {
        return _fname;
    }
    public static void setFname(String fname) {
        _fname = fname;
    }
    private static String _fPath;

    public static String getPath() {
        return _fPath;
    }
    public static void setPath(String _fPath) {
        CreateFile._fPath = _fPath;
    }
    public static void Create(int strNum) throws IOException{
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.print("Введите имя файла => ");
         setFname(sc.nextLine());
         try {
            File f1 = new File(getFname());
            f1.createNewFile();
            setPath(f1.getAbsolutePath());
            System.out.println("Полный путь файла: " + f1.getAbsolutePath());
            int n = strNum;
            DataOutputStream dOut = new DataOutputStream(new FileOutputStream(f1));
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                System.out.print("Введите строку для записи в файл => ");
                String s = sc.nextLine();
                dOut.writeUTF(s+"\n");
            }
            dOut.flush();
            dOut.close();

         } catch (Exception e) {
            System.out.println("" + e);
         }
    }
}
