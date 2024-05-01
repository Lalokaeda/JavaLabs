package javaapp.lr3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        try{
            int numsCount=in.nextInt();
            int[] nums = new int[numsCount];
            nums[0]=2;
            for(int i=1; i<nums.length; i++){
                nums[i]=nums[i-1]+5;
            }
            for (int i : nums) {
                System.out.print(i + " ");
            }
        }catch(Exception e){
            System.out.println("Введено некорректное значение");
        }
        in.close();
    }
}
