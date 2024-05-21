package javaapp.lr2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Input number");
        int num = in.nextInt();
        if (num >=5 && num <=10)
            System.out.println("Число попадает в диапазон");
        else
            System.out.println("Число не попадает в диапазон");
        in.close();
    }
}
