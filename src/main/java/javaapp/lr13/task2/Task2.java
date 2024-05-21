package javaapp.lr13.task2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    static int[][] matrix = new int[10][10];
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Random rnd = new Random();
        for(int i=0; i<matrix.length; i++)
        for(int j=0; j<matrix[i].length;j++){
            matrix[i][j]=rnd.nextInt(100);
        }
        System.out.println("Введите номер столбца");
        printColumn();
        
    }

    public static void printColumn() {
        try {
        int num = in.nextInt();
        System.out.println();
        for(int i=0; i<matrix[num-1].length;i++){
            System.out.print(matrix[i][num-1]+ " ");
        }
        } catch (InputMismatchException e) {
            System.out.println("Введите число");
            printColumn();
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Столбца с таким номером нет в матрице, введите значение от 1 до 10");
            printColumn();
        }
    }
}
