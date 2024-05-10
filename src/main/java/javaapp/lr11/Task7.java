package javaapp.lr11;

import java.util.List;
import java.util.Scanner;

public class Task7 {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
     String str = "Черемуха душистая\r\n" +
                        "С весною расцвела\r\n" +
                        "И ветки золотистые,\r\n" +
                        "Что кудри, завила.\r\n" +
                        "Кругом роса медвяная\r\n" +
                        "Сползает по коре,\r\n" +
                        "Под нею зелень пряная\r\n" +
                        "Сияет в серебре.\r\n" +
                        "А рядом, у проталинки,\r\n" +
                        "В траве, между корней,\r\n" +
                        "Бежит, струится маленький\r\n" +
                        "Серебряный ручей.";
    List<String> strs = List.of(str.split("\r\n"));
    System.out.println("Список строк: ");
    for (String string : strs) {
        System.out.println(string);
    }
    System.out.println();
    System.out.println("Введите длину строки");
    int length = in.nextInt();
    System.out.println();
    System.out.println("Строки после фильтрации: ");
    List<String> result = filterLength(strs, length);
    for (String string : result) {
        System.out.println(string);
    }
    in.close();
}
public static List<String> filterLength(List<String> list, int length) {
    return list.stream().filter(x-> x.length()==length).toList();
    
}
}
