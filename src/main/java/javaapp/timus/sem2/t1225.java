package javaapp.timus.sem2;

import java.util.Scanner;

public class t1225 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        long[] nums = new long[N];
        if (nums.length>1){
            nums[0]=2;
            nums[1]=2;

            for (int i=2;i<N; i++){
                nums[i]=nums[i-1]+nums[i-2];
            }
            System.out.println(nums[N-1]);
        } else 
        System.out.println(2);
    }
}
