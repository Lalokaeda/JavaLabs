package javaapp.lr3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Task10 {
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        Integer[] nums = new Integer[size];
        Random random = new Random();
        for (int i=0; i<nums.length; i++){
            nums[i]=random.nextInt(200);
            System.out.print(nums[i]+" ");
        }
        Arrays.sort(nums, Collections.<Integer>reverseOrder());
        System.out.println("\nОтсортированный в порядке убывания массив: ");
        for (int i : nums) {
            System.out.print(i+" ");
        }
        in.close();
    }
}
