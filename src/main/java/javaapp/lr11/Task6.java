package javaapp.lr11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task6 {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Введите размер массива");
    int size = in.nextInt();
    List<Integer> nums = new ArrayList<Integer>();
    Random rnd = new Random();
    for(int i = 0; i<size; i++){
        nums.add(rnd.nextInt(1000));
    }
    System.out.println("Список: ");
    System.out.println(nums.toString());
    System.err.println("Введите делитель");
    int div = in.nextInt();
    System.out.println("Список после фильтрации: ");
    System.out.println(filterDiv(nums, div).toString());
    in.close();

}

public static List<Integer> filterDiv(List<Integer> nums, int divider) {
    return nums.stream().filter(x-> x%divider==0).toList();
}
}
