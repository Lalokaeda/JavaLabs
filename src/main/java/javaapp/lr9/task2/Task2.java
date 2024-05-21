package javaapp.lr9.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите десятичное число:");
        int num = in.nextInt();
        System.out.println(num+" в двоичной системе: "+Converter.ConvertTentoTwo(num));
        in.close();
    }
}
