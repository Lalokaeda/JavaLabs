package javaapp.lr11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
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
    System.out.println("Список квадратов: ");
    System.out.println(getSqrs(nums).toString());
    in.close();
}
public static List<Integer> getSqrs(List<Integer> nums) {
    return nums.stream().map(x->x*x).toList();
}
}
