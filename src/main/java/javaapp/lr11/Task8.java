package javaapp.lr11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task8 {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Введите длину списка");
    int size = in.nextInt();
    List<Integer> nums = new ArrayList<Integer>();
    Random rnd = new Random();
    for(int i = 0; i<size; i++){
        nums.add(rnd.nextInt(1000));
    }
    System.out.println("Список: ");
    System.out.println(nums.toString());
    System.err.println("Введите число для сравнения");
    int num = in.nextInt();
    System.out.println("Список после фильтрации: ");
    System.out.println(filterBigger(nums, num).toString());
    in.close();

}

public static List<Integer> filterBigger(List<Integer> nums, int num) {
    return nums.stream().filter(x-> x>num).toList();
}
}
