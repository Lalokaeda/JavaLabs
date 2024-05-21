package javaapp.lr9.task3;

import java.util.Scanner;

public class Task3 {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] array = new int[5];
    InputOutputArray.Input(array, 0, in);
    in.close();
    System.out.println("Записанный массив: ");
    InputOutputArray.Output(array, 0);
}
}
