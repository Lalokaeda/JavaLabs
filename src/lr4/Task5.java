package lr4;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int rows = 10;
        int columns = 5;
        int [][] array = new int[rows][columns];
        Random rnd = new Random();
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                array[i][j]=rnd.nextInt(99);
            }
        }

        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j+ " ");
            }
            System.out.println("");
        }
        System.out.println("\n");
        transpose(array);
    }

    public static void transpose(int [][] array) {
        int[][] newArray = new int[array[0].length][array.length];
            for(int i=0; i<newArray.length; i++){
            for(int j=0; j<newArray[i].length; j++){
                newArray[i][j]=array[j][i];
            }
        }
         for (int[] i : newArray) {
            for (int j : i) {
                System.out.print(j+ " ");
            }
            System.out.println("");
        }
    }
}
