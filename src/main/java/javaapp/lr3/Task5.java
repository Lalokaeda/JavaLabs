package javaapp.lr3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int numsCount = in.nextInt();
        int[] nums = new int[numsCount];
        int a=0;
        int sum=0;
        in.close();
        for(int i=0; i<nums.length; a++){
            while(a%3==1 || a%5==2){
                System.out.print(a + " ");
                sum+=a;
                i++;
                break;
            }      
        }
    System.out.println("\nСумма = " + sum);
    }
}
