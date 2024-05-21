package javaapp.lr11;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> strs = new ArrayList<String>();
        strs.add("Строка1");
        strs.add("cтрока2");
        strs.add("cтрока3");
        strs.add("Строка4");
        strs.add("cтрока5");
        System.out.println("Список строк: ");
        System.out.println(strs.toString());
        System.out.println("Строки, начинающиеся с заглавной буквы: ");
        System.out.println(filterUp(strs).toString());
    }

    public static List<String> filterUp(List<String> list) {
        return list.stream()
                .filter(x -> Character.isUpperCase(x
                        .charAt(0)))
                .toList();
    }
}
