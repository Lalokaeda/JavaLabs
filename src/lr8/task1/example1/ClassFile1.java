package lr8.task1.example1;

import java.io.File;

public class ClassFile1 {
    public static void main(String[] args) {
        try {
            File f1 = new File("MyFile1.txt");
            f1.createNewFile();
            if (f1.exists()) {
                System.out.println("Создан!!!!");
                System.out.println("Полный путь MyFile1: " + f1.getAbsolutePath());
            }
            File f2 = new File("D:\\MyFile2.txt");
            f2.createNewFile();
            System.out.println("Полный путь MyFile2: " + f2.getAbsolutePath());
            File f3 = new File("D:\\Papka1\\Papka2\\Papka3");
            f3.mkdirs();
            System.out.println("Полный путь вложенных: " + f3.getAbsolutePath());
        } catch (Exception e) {
            System.out.println("Ошибка!!! " + e);
        }
    }
}
