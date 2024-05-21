package javaapp.lr13.task2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.println("Введите размер массива: ");
    try {
        int n = in.nextInt();
        int[] arr = new int[n];
        int c = 0;
        for(int i = 0; i<n;i++){
            arr[i]=in.nextInt();
            if(arr[i]<0);
            c++;
        }
            int sum = Arrays.stream(arr).filter(x->x>0).sum();
            if (sum==0){
                throw new Exception();
            }
            else{
                System.out.println(sum/c);
            }
    } catch (InputMismatchException e) {
        System.out.println("Введенное значение не является целым числом");
        main(args);
    }
    catch (Exception e) {
        System.out.println("В массиве нет положительных чисел");
        main(args);
    }
}

}
