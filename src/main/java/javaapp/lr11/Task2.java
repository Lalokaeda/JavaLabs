package javaapp.lr11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
    System.out.println("Введите размер массивов");
    int size = in.nextInt();
    int[] nums1 = new int[size];
    int[] nums2 = new int[size];
    Random rnd = new Random();
    for(int i = 0; i<size; i++){
        nums1[i]=rnd.nextInt(200);
        nums2[i]=rnd.nextInt(200);
    }
    System.out.println("Массив 1: ");
    System.out.println(Arrays.toString(nums1));
    System.out.println("Массив 2: ");
    System.out.println(Arrays.toString(nums2));
    System.out.println("Массив после фильтрации: ");
    System.out.println(Arrays.toString(filterSameNums(nums1, nums2)));
    in.close();
}

public static int[] filterSameNums(int[] array1, int[] array2) {
    return Arrays.stream(array2)
    .filter(x -> Arrays
            .stream(array1)
            .anyMatch(y -> y == x))
    .toArray();
}
}
