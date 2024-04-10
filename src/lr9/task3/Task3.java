package lr9.task3;

import java.util.Scanner;

import lr9.task2.Converter;

public class Task3 {
public static void main(String[] args) {
    InputOutputArray ar = new InputOutputArray();
    int[] array = new int[5];
    ar.setArray(array);
    ar.Input(0);
    System.out.println("Записанный массив: ");
    ar.Output(0);
}
}
