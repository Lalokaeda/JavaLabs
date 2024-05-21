package javaapp.lr11;

import java.util.List;

public class Task5 {
    public static void main(String[] args) {
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
    System.out.println("Строки, содержащие запятую: ");
    List<String> result = filterSubs(strs, ",");
    for (String string : result) {
        System.out.println(string);
    }
    }

    public static List<String> filterSubs(List<String> list, String subString) {
        return list.stream()
                .filter(x -> x.contains(subString))
                .toList();
    }
}
