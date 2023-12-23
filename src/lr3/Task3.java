package lr3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Введите количество чисел:");
    int numsCount = in.nextInt();
    int[] nums = new int[numsCount];
    in.close();
        if (nums.length>1){
            nums[0]=1;
            nums[1]=1;
            System.out.println("Последовательность Фибоначчи: ");
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
        else if (nums.length==1){
            nums[0]=1;
            System.out.print(nums[0]);
        }
    }

    public static int[] WithFor(int[] nums) {
        int num0=nums[0];
        int num1=nums[1];
        for (int i=2;i<nums.length; i++){
            nums[i]=num0+num1;
            num0=num1;
            num1=nums[i];
        }
        return nums;
    }

    public static int[] WithWhile(int[] nums) {
        int num0=nums[0];
        int num1=nums[1];
        int i = 2;
        while (i<nums.length){
            nums[i]=num0+num1;
            num0=num1;
            num1=nums[i];
            i++;
        }
        return nums;
    }

    public static int[] WithDoWhile(int[] nums) {
        int num0=nums[0];
        int num1=nums[1];
        int i = 2;
        do{
            nums[i]=num0+num1;
            num0=num1;
            num1=nums[i];
            i++;
        } while (i<nums.length);
        return nums;
    }
}
