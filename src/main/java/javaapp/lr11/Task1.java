package javaapp.lr11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Введите размер массива");
    int size = in.nextInt();
    int[] nums = new int[size];
    Random rnd = new Random();
    for(int i = 0; i<size; i++){
        nums[i]=rnd.nextInt(1000);
    }
    System.out.println("Массив: ");
    System.out.println(Arrays.toString(nums));
    System.out.println("Массив после фильтрации: ");
    System.out.println(Arrays.toString(filterEvenNums(nums)));
    in.close();

}

public static int[] filterEvenNums(int[] nums) {
    return Arrays.stream(nums).filter(x-> x%2==0).toArray();
}
}
