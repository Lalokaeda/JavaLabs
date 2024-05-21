package javaapp.lr9.task3;

import java.util.Scanner;

public class InputOutputArray {
    private int[] array;

    public int[] getArray() {
        return array;
    }
    public void setArray(int[] array) {
        this.array = array;
    }
    
    public static void Input(int[] arr, int index, Scanner in) {
        if (index < arr.length) {
            System.out.print("Введите элемент массива №" + index + ": ");
            arr[index] = in.nextInt();
            Input(arr, index + 1, in);
        }
    }

    public static void Output(int[] arr,int index) {
        if (index < arr.length) {
            System.out.print(arr[index] + " ");
            Output(arr, index + 1);
        }
    }

}
