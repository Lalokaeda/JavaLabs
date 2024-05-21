package javaapp.lr11;

import java.util.List;
import java.util.stream.Collectors;

public class Task9 {
public static void main(String[] args) {
    List<String> strs = List.of("hello123", "world", "12345", "onlyLetters");
    System.out.println("Список строк: ");
    for (String string : strs) {
        System.out.println(string);
    }
    System.out.println();
    System.out.println("Строки после фильтрации: ");
    List<String> result = filterStrings(strs);
    for (String string : result) {
        System.out.println(string);
    }
}

 public static List<String> filterStrings(List<String> strings) {
        return strings.stream()
                .filter(str -> str.matches("[a-zA-Z]+"))
                .collect(Collectors.toList());
    }
}
