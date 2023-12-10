package lr3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        int[] nums = new int[size];
        Random random = new Random();
        for (int i=0; i<nums.length; i++){
            nums[i]=random.nextInt(200);
            System.out.print(nums[i]+" ");
        }
        ArrayList <Integer> indexesOfMin = new ArrayList<Integer>();
        int min = Arrays.stream(nums).min().getAsInt();
        for (int i=0; i<nums.length;i++) {
            if(nums[i]==min)
            indexesOfMin.add(i);
        }
        System.out.println("\nМинимальное значение элемента в массиве: " + min);
        System.out.println("Индексы элементов с минимальным значением: ");
        for (Integer i : indexesOfMin) {
            System.out.print(i+" ");
        }
        in.close();
    }
}
