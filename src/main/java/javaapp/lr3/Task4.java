package javaapp.lr3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Введите 2 числа: ");
    int startNum=in.nextInt(); 
    int endNum=in.nextInt(); 
    int[] nums = new int[endNum-startNum+1];
    in.close();
    nums[0]=startNum;
    System.out.println("For: ");
    for (int i : WithFor(nums)) {
        System.out.print(i + " ");
    }
    System.out.println("\nWhile: ");
    for (int i : WithWhile(nums)) {
        System.out.print(i + " ");
    }

    System.out.println("\nDo-While: ");
    for (int i : WithDoWhile(nums)) {
        System.out.print(i + " ");
    }
    }

    public static int[] WithFor(int[] nums) {
        int num=nums[0];
        for(int i=0; i<nums.length; i++){
            nums[i]=num++;
        }
        return nums;
    }

    public static int[] WithWhile(int[] nums) {
        int num=nums[0];
        int i=0;
        while(i<nums.length){
            nums[i]=num++;
            i++;
        }
        return nums;
    }

    public static int[] WithDoWhile(int[] nums) {
        int num=nums[0];
        int i=0;
        do{
            nums[i]=num++;
            i++;
        }while(i<nums.length);
        return nums;
    }
}
